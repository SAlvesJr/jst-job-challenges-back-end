package com.SAlvesJr.webService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.SAlvesJr.webService.model.CharacterFavorite;
import com.SAlvesJr.webService.model.CharacterOBJ;
import com.SAlvesJr.webService.model.CharacterOBJList;
import com.SAlvesJr.webService.repositories.CharacterFavoriteRepository;

@Service
public class CharacterService {

	@Autowired
	private CharacterFavoriteRepository repoFavorite;

	@Value("${access.token.superHero}")
	private String token;

	private static final String GET_FIND_CARACTED = "https://superheroapi.com/api/";
	private static final String GET_SEARCH_NAME = "https://superheroapi.com/api/";

	public List<CharacterOBJ> searchName(String name) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = GET_SEARCH_NAME + token + "/search/" + name;
		CharacterOBJList response = restTemplate.getForObject(fooResourceUrl, CharacterOBJList.class);
		return response.getListCharacterOBJ();
	}

	public CharacterOBJ findCaractedId(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = GET_FIND_CARACTED + token + "/" + id;
		CharacterOBJ response = restTemplate.getForObject(fooResourceUrl, CharacterOBJ.class);
		return response;
	}

	public List<CharacterFavorite> listAllFavorite() {
		return repoFavorite.findAll();
	}

	public void saveFavorite(CharacterFavorite characterFavorite) {
		repoFavorite.save(characterFavorite);
	}

}
