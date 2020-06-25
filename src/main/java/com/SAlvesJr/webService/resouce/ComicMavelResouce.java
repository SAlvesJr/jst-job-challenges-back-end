package com.SAlvesJr.webService.resouce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SAlvesJr.webService.model.Comics;
import com.SAlvesJr.webService.service.ComicMavelService;

@RestController
@RequestMapping(value = "/comics")
public class ComicMavelResouce {

	@Autowired
	ComicMavelService comicsService;

	@GetMapping(value = "/search")
	public ResponseEntity<List<Comics>> searchForName(@RequestParam(value = "name") String name) {
		List<Comics> result = comicsService.searchComicsName(name);
		return ResponseEntity.ok().body(result);
	}

}
