package com.smartsearch.service.ws;

import javax.jws.WebService;

import com.smartsearch.dto.ws.SearchWsRequest;
import com.smartsearch.dto.ws.SearchWsResponse;

@WebService(endpointInterface = "com.smartsearch.service.ws.SearchService")
public class SearchServiceImpl implements SearchService{

	@Override
	public SearchWsResponse search(SearchWsRequest request) {
		// TODO Auto-generated method stub
		System.out.println("Inside WebService !!!");
		return new SearchWsResponse();
	}

	@Override
	public SearchWsResponse find(String request) {
		// TODO Auto-generated method stub
		return null;
	}

}
