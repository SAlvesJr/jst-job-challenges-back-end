package com.SAlvesJr.webService.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterOBJ {

	@JsonProperty(value = "id")
	private String id;
	@JsonProperty(value = "name")
	private String name;
	@JsonProperty(value = "powerstats")
	private Powerstats powerstats;
	@JsonProperty(value = "work")
	private Work work;
	@JsonProperty(value = "image")
	private Image image;

	public CharacterOBJ() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Powerstats getPowerstats() {
		return powerstats;
	}

	public void setPowerstats(Powerstats powerstats) {
		this.powerstats = powerstats;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}

}
