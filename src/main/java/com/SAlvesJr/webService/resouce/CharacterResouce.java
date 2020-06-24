package com.SAlvesJr.webService.resouce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SAlvesJr.webService.model.CharacterOBJ;
import com.SAlvesJr.webService.service.CharacterService;

@RestController
@RequestMapping(value = "/characters")
public class CharacterResouce {

	@Autowired
	CharacterService characterService;

	@GetMapping(value = "search/{name}")
	public ResponseEntity<List<CharacterOBJ>> searchForName(@PathVariable String name) {
		List<CharacterOBJ> result = characterService.searchName(name);
		return ResponseEntity.ok().body(result);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<CharacterOBJ> findById(@PathVariable Long id) {
		CharacterOBJ cObj = characterService.findCaractedId(id);
		return ResponseEntity.ok().body(cObj);
	}

}
