package com.smartsearch.service.user;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.smartsearch.dto.UserDto;

@Produces({"application/xml","application/json"})
public interface UserService {
	
	@POST
	@Path("/user/auth")
	public UserDto authanticate(@FormParam("username") String username, 
			@FormParam("password") String password) throws ServiceException;
}
