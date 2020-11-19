package com.escalab.app.service.impl;

import com.escalab.app.constants.DragonBallApi;
import com.escalab.app.model.Character;
import com.escalab.app.service.CharacterService;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CharacterServiceImpl implements CharacterService {

    @Override
    public List<Character> getAllCharacters() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Character[]> resp = restTemplate.exchange(DragonBallApi.GET_ALL_CHARACTERS, HttpMethod.GET, null, Character[].class);
        List<Character> characters = Arrays.asList(resp.getBody());
        return characters;
    }
}
