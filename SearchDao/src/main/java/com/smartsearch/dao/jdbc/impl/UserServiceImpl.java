package com.smartsearch.dao.jdbc.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.smartsearch.dao.jdbc.UserDao;

public class UserServiceImpl implements UserService {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate template;
	
	private static final String INSERT_USER = " INSERT INTO customer (id, name, username, email_address, phone, password, created , updated) "
			+ "	VALUES (null, ? , ?, ? , ?, MD5(?), ?,?)";
	private static final String UDPATE_USER = " UPDATE customer SET name = ?, username = ? , email_address = ? , phone = ?, password = ? , updated = ? "
			+ "WHERE id = ? ";
	private static final String DELETE_USER = " DELETE from customer WHERE id = ?";
	private static final String GET_USER_ID = " SELECT id, name, username, email_address, phone, password FROM customer where id = ? ";
	private static final String GET_USER_PASS = " SELECT id, name, username, email_address, phone, password "
			+ "FROM customer "
			+ "WHERE username = ? and password = MD5(?)";
	
	
	@Override
	public UserDao getUser(String username, String password) throws DAOException {
		if(username == null || password == null){
			throw new DAOException(DAOException.ILLIGALARG,"Username or Password Should not be null");
		}
		UserDao user= null;
		try {
			user = this.template.queryForObject(GET_USER_PASS, new Object[]{username,password}, new UserRawMapper<UserDao>());
			if(user == null){
				throw new DAOException(DAOException.NOT_AUTHORIZED,"Username or Password is not correct ");
			}
			return user;
		}
		catch (Exception e){
			throw new DAOException(DAOException.ILLIGALARG,e.getMessage(), e);
		}
		
	}

	@Override
	public UserDao getUser(Integer id) throws DAOException {
		
		if(id == null ){
			throw new DAOException(DAOException.ILLIGALARG,"Username or Password Should not be null");
		}
		UserDao user= null;
		try {
			user = this.template.queryForObject(GET_USER_ID, new Object[]{id}, new UserRawMapper<UserDao>());
			if(user == null){
				throw new DAOException(DAOException.NOT_EXIST,"Record Not exists ");
			}
			return user;
		}
		catch (Exception e){
			throw new DAOException(DAOException.ILLIGALARG,e.getMessage(), e);
		}
	}

	@Override
	public boolean addUser(UserDao user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(UserDao user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleetUser(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template = new JdbcTemplate(dataSource);
	}
	
	private static class UserRawMapper<T> implements RowMapper<UserDao> {

		@Override
		public UserDao mapRow(ResultSet rs, int arg1) throws SQLException {
			UserDao dao = new UserDao();
			dao.setId(rs.getInt("id"));
			dao.setName(rs.getString("name"));
			dao.setUsername(rs.getString("username"));
			dao.setPassword(rs.getString("password"));
			dao.setEmail(rs.getString("email_address"));
			return dao;
		}
		
	}
	
	
	

}
