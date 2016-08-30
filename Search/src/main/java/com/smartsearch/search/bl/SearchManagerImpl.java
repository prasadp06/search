package com.smartsearch.search.bl;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.smartsearch.dao.jdbc.SearchDao;
import com.smartsearch.dao.jdbc.impl.SearchDoaService;
import com.smartsearch.search.exception.BOException;
import com.smartserach.search.dto.Search;

public class SearchManagerImpl implements SearchManager {

	
	SearchDoaService searchDaoService;
	
	@Override
	public Search get(Integer Id) throws BOException{
		if(Id == null){
			throw new BOException("ERR0001","Id cannot be Null");
		}
		
		return copyFromDao(searchDaoService.get(Id));
	}

	@Override
	public boolean update(Search tag) throws BOException{
		if(tag == null){
			throw new BOException("ERR0002","Search Object cannot be null !");
		}
		
		StringTokenizer tokens = new StringTokenizer(tag.getTagName());
		while(tokens.hasMoreTokens()){
			tag.getTags().add(tokens.nextToken());
		}
		searchDaoService.update(copyToDao(tag));
		return true;
	}

	@Override
	public boolean add(Search tag) throws BOException{
		if(tag == null){
			throw new BOException("ERR0002","Search Object cannot be null !");
		}
		
		StringTokenizer tokens = new StringTokenizer(tag.getTagName());
		while(tokens.hasMoreTokens()){
			tag.getTags().add(tokens.nextToken());
		}
		searchDaoService.insert(copyToDao(tag));
		
		return true;
	}

	@Override
	public boolean delete(Search tag) throws BOException{
		if(tag == null){
			throw new BOException("ERR0002","Search Object cannot be null !");
		}
		searchDaoService.delete(copyToDao(tag));
		return true;
	}

	@Override
	public List<Search> search(String query) throws BOException{
		if(query == null){
			throw new BOException("ERR0003", "Query String Should not be empty");
		}
		
		List<Search> result = new ArrayList<Search>();
		try {
			List<SearchDao> list = searchDaoService.searchTags(query);
			for(SearchDao dao : list){
				result.add(copyFromDao(dao));
			}
		}
		catch(Exception e){
			throw new BOException("ERR0003", e.getMessage());
		}
		return result;
	}

	public void setSearchDaoService(SearchDoaService searchDaoService) {
		this.searchDaoService = searchDaoService;
	}
	
	private SearchDao copyToDao(Search dto){
		SearchDao dao = new SearchDao();
		dao.setTagName(dto.getTagName());
		dao.setLocation(dto.getLocation());
		dao.setAddress(dto.getAddress());
		dao.setLon(dto.getLat());
		dao.setLat(dto.getLon());
		dao.getTags().addAll(dto.getTags());
		return dao;
	}

	
	private Search copyFromDao(SearchDao dao){
		Search dto  = new Search();
		dto.setTagName(dao.getTagName());
		dto.setLocation(dao.getLocation());
		dto.setAddress(dao.getAddress());
		dto.setLon(dao.getLat());
		dto.setLat(dao.getLon());
		dto.getTags().addAll(dao.getTags());
		
		return dto;
	}
}
