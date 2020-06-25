package com.SAlvesJr.webService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comics {

	@JsonProperty(value = "resourceURI")
	private String resourceURI;
	@JsonProperty(value = "name")
	private String name;

	public Comics() {

	}

	public Comics(String resourceURI, String name) {
		this.resourceURI = resourceURI;
		this.name = name;
	}

	public String getResourceURI() {
		return resourceURI;
	}

	public void setResourceURI(String resourceURI) {
		this.resourceURI = resourceURI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
