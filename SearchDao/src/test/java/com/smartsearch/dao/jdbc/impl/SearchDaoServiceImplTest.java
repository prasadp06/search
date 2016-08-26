package com.smartsearch.dao.jdbc.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smartsearch.dao.jdbc.SearchDao;

public class SearchDaoServiceImplTest {
	/*
	static Integer key = null;
	ApplicationContext ctx;
	
	@Before
	public void init(){
		ctx = new ClassPathXmlApplicationContext("search-servlet.xml");
	}

	@Test
	public void insertSearchWithAllData() {
		SearchDao s = new SearchDao();
		s.setTagName("Test Tag");
		s.setLocation("Y");
		s.setLat(12.11);
		s.setLon(14.65);
		SearchDoaService service = ctx.getBean("searchDaoService", SearchDoaService.class);
		service.insert(s);
		key = s.getId();
		System.out.println(key);
		assertTrue(key > 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void insertSearchTagsWithMissingName() {
		fail("Not yet implemented");
	}

	@Test
	public void updateSearchWithId() {
		fail("Not yet implemented");
	}

	@Test
	public void updateSearchWithoutId() {
		fail("Not yet implemented");
	}

	@Test
	public void searchWithSearchKey() {
		fail("Not yet implemented");
	}
	
	@Test
	public void searchWithOutKey() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testGet() {
		assertTrue(true);
	}

}
