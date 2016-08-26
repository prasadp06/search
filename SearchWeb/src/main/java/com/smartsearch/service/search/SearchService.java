package com.smartsearch.service.search;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.smartsearch.dto.SearchDto;

@Produces({"application/xml","application/json"})
public interface SearchService {
	
	@GET
	@Path("/search/get/{q}/")
	public SearchDto get(@PathParam("q") String id);
	
	@GET
	@Path("/search/{q}/")
	public List<SearchDto> search(@PathParam("q") String keys);
	
	@PUT
	@Path("/search/edit/")
	public Response updateTag(SearchDto tag);
	
	@POST
	@Path("/search/add/")
	public Response addTag(SearchDto tag);
	
	@DELETE
	@Path("/search/delete/")
	public Response delete(SearchDto tag);
	
	
}
