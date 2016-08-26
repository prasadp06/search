package com.smartsearch.dto.ws;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name="Search")
@XmlAccessorType(XmlAccessType.FIELD)
public class Search {
	
	@XmlElement(name="tagId")
	Integer tagId;
	
	@XmlElement(name="tagName")
	String tagName; 
	
	@XmlElement(name="location")
	String location; 
	
	@XmlElement(name="address")
	String address; 
	
	@XmlElement(name="lat")
	Double lat; 
	
	@XmlElement(name="lon")
	Double lon;
	
	@XmlElement(name="tags")
	ArrayList<String> tags;
	
	public ArrayList<String> getTags() {
		if(this.tags == null){
			this.tags = new ArrayList<String>();
		}
		return tags;
	}
	public void setTags(ArrayList<String> tags) {
		
		this.tags = tags;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	
	
	
}

