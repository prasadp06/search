package com.smartsearch.dto.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SearchWsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchWsResponse {
	@XmlElement(name="search")
	List<Search> search;

	public List<Search> getSearch() {
		if(this.search == null){
			this.search = new ArrayList<Search>();
		}
		return search;
	}

	public void setSearch(List<Search> search) {
		
		this.search = search;
	}
}
