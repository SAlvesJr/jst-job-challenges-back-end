package com.SAlvesJr.webService.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.SAlvesJr.webService.model.CharacterOBJ;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CharacterOBJDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonProperty(value = "results")
	private List<CharacterOBJ> listCharacterOBJ;

	public CharacterOBJDTO() {
		listCharacterOBJ = new ArrayList<>();
	}

	public List<CharacterOBJ> getListCharacterOBJ() {
		return listCharacterOBJ;
	}

	public void setListCharacterOBJ(List<CharacterOBJ> listCharacterOBJ) {
		this.listCharacterOBJ = listCharacterOBJ;
	}

}
