package com.smartsearch.search.bl;

import com.smartsearch.search.exception.BOException;
import com.smartserach.search.dto.User;

public interface UserManager {
	public User authanticate(String username, String password) throws BOException;
	public User getUser(Integer id) throws BOException;
	public boolean insert(User user) throws BOException;
	public boolean update(User user) throws BOException;
	public boolean detele(Integer id) throws BOException;
	
}
