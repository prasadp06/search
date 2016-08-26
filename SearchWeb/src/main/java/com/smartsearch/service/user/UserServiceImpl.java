package com.smartsearch.service.user;


import com.smartsearch.dto.UserDto;
import com.smartsearch.search.bl.UserManager;
import com.smartsearch.search.exception.BOException;
import com.smartserach.search.dto.User;

/**
 * 
 * @author prasadprabhakaran
 *
 */
public class UserServiceImpl implements UserService {

	UserManager userManager; 
	
	@Override
	public UserDto authanticate(String username, String password) throws ServiceException {
		try {
			System.out.println("-------- " + username + "----" + password);
			return copyFromBusinessObject(userManager.authanticate(username, password));
		} catch (BOException e) {
			throw new ServiceException(e.getErrorCode(), "Authantication Faild! Username or Password is incorrect");
		} catch (Throwable e) {
			throw new ServiceException("UNK0001", "Unknown Error");
		}
		
	}
	
	private User copyToBusinessObject(UserDto from){
		User to = new User();
		to.setEmail(from.getEmail());
		to.setId(from.getId());
		to.setName(from.getName());
		to.setPassword(from.getPassword());
		to.setPhone(from.getPhone());
		to.setUsername(from.getUsername());
		
		return to;
	}
	
	private UserDto copyFromBusinessObject(User from){
		UserDto to = new UserDto();
		to.setEmail(from.getEmail());
		to.setId(from.getId());
		to.setName(from.getName());
		to.setPassword(from.getPassword());
		to.setPhone(from.getPhone());
		to.setUsername(from.getUsername());
		return to;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

}
