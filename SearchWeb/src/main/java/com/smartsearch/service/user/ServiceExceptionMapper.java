package com.smartsearch.service.user;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ServiceExceptionMapper implements ExceptionMapper<ServiceException>{

	@Override
	public Response toResponse(ServiceException arg0) {
		StringBuilder builder = new StringBuilder();
		builder.append("<response>");
		builder.append("<code>").append(arg0.getErrorCode()).append("</code>");
		builder.append("<message>").append(arg0.getMessage()).append("</message>");
		builder.append("</response>");
		return Response.serverError().entity(builder.toString())
				.type(MediaType.APPLICATION_XML).build();
	}

}
