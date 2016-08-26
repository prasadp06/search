package com.smartsearch.service.search;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.StatusType;

import org.springframework.beans.factory.annotation.Autowired;

import com.smartsearch.dto.SearchDto;
import com.smartsearch.search.bl.SearchManager;
import com.smartsearch.search.exception.BOException;
import com.smartserach.search.dto.Search;

/**
 * 
 * @author prasadprabhakaran
 *
 */
public class SearchServiceImpl implements SearchService{

	/**
	 * 
	 * @param searchManager
	 */
	public void setSearchManager(SearchManager searchManager) {
		this.searchManager = searchManager;
	}

	@Autowired
	SearchManager searchManager;
	
	/**
	 * 
	 * @param keys
	 * @return
	 */
	@Override
	public  List<SearchDto> search(String keys) {
		System.out.println("Inside Search " + keys);
		try {
			List<SearchDto> dtos = new ArrayList<SearchDto>();
			List<Search> results = searchManager.search(keys);
			
			if(results != null && results.size() > 0){
				for(Search s:results){
					dtos.add( copyFromBusinessObject(s));
				}
			}
			return dtos;
		} catch (BOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param tag
	 * @return
	 */
	@Override
	public Response updateTag(SearchDto tag) {
		try {
			return Response.ok(searchManager.update(copyToBusinessObject(tag))).build();
		} catch (BOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(500).type("text/plain")
                .entity("OOPs Unexpected Error !!").build();
	}

	/**
	 * 
	 * @param tag
	 * @return
	 */
	@Override
	public Response addTag(SearchDto tag) {
		try {
			return Response.ok(searchManager.add(copyToBusinessObject(tag))).build();
		} catch (BOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(500).type("text/plain")
                .entity("OOPs Unexpected Error !!").build();
	}

	/**
	 * 
	 * @param tag
	 * @return
	 */
	@Override
	public Response delete(SearchDto tag) {
		try {
			return Response.ok(searchManager.delete(copyToBusinessObject(tag))).build();
		} catch (BOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Response.status(500).type("text/plain")
                .entity("OOPs Unexpected Error !!").build();
	}

	/**
	 * 
	 * @param from
	 * @return
	 */
	private Search copyToBusinessObject(SearchDto from){
		Search to = new Search();
		to.setAddress(from.getAddress());
		to.setLat(from.getLat());
		to.setLocation(from.getLocation());
		to.setLon(from.getLon());
		to.setTagId(from.getTagId());
		to.setTagName(from.getTagName());
		to.setTags(from.getTags());
		return to;
	}
	
	private SearchDto copyFromBusinessObject(Search from){
		SearchDto to = new SearchDto();
		to.setAddress(from.getAddress());
		to.setLat(from.getLat());
		to.setLocation(from.getLocation());
		to.setLon(from.getLon());
		to.setTagId(from.getTagId());
		to.setTagName(from.getTagName());
		to.setTags(from.getTags());
		return to;
	}
	
	@Override
	public SearchDto get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
