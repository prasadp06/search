package com.smartsearch.dao.jdbc.impl;

import com.smartsearch.dao.jdbc.UserDao;

public interface UserService {
	public UserDao getUser(String user, String password) throws DAOException;
	public UserDao getUser(Integer id) throws DAOException;
	public boolean addUser(UserDao user) throws DAOException;
	public boolean updateUser(UserDao user) throws DAOException;
	public boolean deleetUser(Integer id) throws DAOException;
}
