package com.smartsearch.search.bl;

import com.smartsearch.dao.jdbc.UserDao;
import com.smartsearch.dao.jdbc.impl.DAOException;
import com.smartsearch.dao.jdbc.impl.UserService;
import com.smartsearch.search.exception.BOException;
import com.smartserach.search.dto.User;

public class UserManagerImpl implements UserManager {

	private UserService userDaoService;
	
	@Override
	public User authanticate(String username, String password) throws BOException {
		User user;
		try {
			user = copyToDto(userDaoService.getUser(username, password));
		} catch (DAOException e) {
			throw new BOException(e.getErrorCode(), e.getErrorMessage());
		}
		return user;
	}

	@Override
	public User getUser(Integer id) throws BOException {
		User user;
		try {
			user = copyToDto(userDaoService.getUser(id));
		} catch (DAOException e) {
			throw new BOException(e.getErrorCode(), e.getErrorMessage());
		}
		return user;	
	}

	@Override
	public boolean insert(User user) throws BOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(User user) throws BOException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean detele(Integer id) throws BOException {
		// TODO Auto-generated method stub
		return false;
	}

	public void setUserDaoService(UserService userDaoService) {
		this.userDaoService = userDaoService;
	}
	
	
	private UserDao copyToDao(User dto){
		UserDao dao = new UserDao();
		dao.setEmail(dto.getEmail());
		dao.setUsername(dto.getUsername());
		dao.setName(dto.getName());
		dao.setPassword(dto.getPassword());
		return dao;
		
	}
	
	private User copyToDto(UserDao dao){
		User dto = new User();
		dto.setEmail(dao.getEmail());
		dto.setUsername(dao.getUsername());
		dto.setName(dao.getName());
		dto.setPassword(dao.getPassword());
		
		return dto;
		
	}

}
