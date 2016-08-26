package com.smartsearch.dao.jdbc.impl;

import java.util.List;

import com.smartsearch.dao.jdbc.SearchDao;

public interface SearchDoaService {
	
	public boolean insert(final SearchDao search) ;
	public boolean update(SearchDao search);
	public boolean delete(SearchDao search);
	public SearchDao get(Integer id);
	public List<SearchDao> searchTags(String query);
}
