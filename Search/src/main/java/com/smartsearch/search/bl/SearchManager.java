package com.smartsearch.search.bl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.smartsearch.search.exception.BOException;
import com.smartserach.search.dto.Search;

@Component
public interface SearchManager {
	
	public Search get(Integer id) throws BOException;
	public boolean update(Search tag) throws BOException;
	public boolean add(Search tag) throws BOException;
	public boolean delete(Search tag) throws BOException;
	public List<Search> search(String query) throws BOException;
	
}
