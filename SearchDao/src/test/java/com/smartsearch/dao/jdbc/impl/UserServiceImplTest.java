package com.smartsearch.dao.jdbc.impl;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smartsearch.dao.jdbc.UserDao;

public class UserServiceImplTest {

	ApplicationContext ctx;
	/*
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("search-servlet.xml");
	}
	
	@Test
	public void testGetUserStringString() throws DAOException {
		UserService userService = ctx.getBean("userDaoService", UserService.class);
		UserDao user = userService.getUser("prasad", "prasad");
		System.out.println(user.getName());
		assertNotNull(user);
	}

	@Test
	public void testGetUserInteger() {
		fail("Not yet implemented");
	}
	*/
}
