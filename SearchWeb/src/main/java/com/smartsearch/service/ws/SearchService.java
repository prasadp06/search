package com.smartsearch.service.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.smartsearch.dto.ws.*;


@WebService(name="SearchService")
public interface SearchService {
	
	@WebMethod(action="search")
	public @WebResult(name="searchResponse") SearchWsResponse search(
			@WebParam(name="search") SearchWsRequest request);
	
	@WebMethod(action="find")
	public @WebResult(name="searchResponse") SearchWsResponse find(
			@WebParam(name="keys") String request);
	
}

