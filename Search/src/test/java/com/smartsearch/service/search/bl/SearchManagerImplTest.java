package com.smartsearch.service.search.bl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smartsearch.dao.jdbc.SearchDao;
import com.smartsearch.dao.jdbc.impl.SearchDoaService;
import com.smartsearch.search.bl.SearchManagerImpl;
import com.smartsearch.search.exception.BOException;
import com.smartserach.search.dto.Search;

import static org.mockito.Mockito.*;

public class SearchManagerImplTest {

	@Mock
	SearchDoaService dao;
	SearchManagerImpl service;
	SearchDao sDao =  null;
	static Integer key;
	Search tag;
	
	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		service = new SearchManagerImpl();
		service.setSearchDaoService(dao);
		
		sDao = new SearchDao();
		sDao.setId(1);
		sDao.setTagName("New York");
		sDao.setLat(123.45);
		sDao.setLon(67.899);
		sDao.setAddress("Addr123");
		
		
		tag = new Search();
		tag.setTagId(1010);
		tag.setTagName("Test Name");
		tag.setLocation("Location");
		tag.setAddress("Address");
		tag.setLat(10.7878);
		tag.setLon(78.9909);
		tag.getTags().add("Tag");
	}
	
	@Test
	public void searchTagsWithName() throws BOException {
		List<SearchDao> rList = new ArrayList<SearchDao>();
		rList.add(sDao);
		
		when(dao.searchTags("new")).thenReturn(rList);
		List<Search> results = service.search("new");
		
		assertTrue(results.size() >0);
		verify(dao).searchTags("new");
	}
	
	@Test(expected=BOException.class)
	public void search_tags_without_name_Should_throw_error() throws BOException {
		when(dao.get(null)).thenThrow(IllegalArgumentException.class);
		List<Search> results = service.search(null);
	}
	
	@Test
	public void update_tag_with_name_and_tags() throws BOException{
		when(dao.update(any(SearchDao.class))).thenReturn(true);
		assertTrue(service.update(tag));
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void update_tag_with_null_id_should_throw_error() throws BOException{
		when(dao.update(any(SearchDao.class))).thenThrow(IllegalArgumentException.class);
		assertTrue(service.update(tag));
		
	}
}
