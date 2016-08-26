package com.smartsearch.dto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SearchWsRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchWsRequest {
	
	@XmlElement(name="search")
	Search search;
	
	@XmlElement(name="keys")
	String keys;

	public Search getSearch() {
		return search;
	}

	public void setSearch(Search search) {
		this.search = search;
	}

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}
}
