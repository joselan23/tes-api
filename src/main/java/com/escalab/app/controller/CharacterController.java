package com.escalab.app.controller;

import com.escalab.app.model.Character;
import com.escalab.app.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CharacterController {

    private CharacterService characterService;

    @Autowired
    public void setCharacterService(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("characters/all")
    public List<Character> getAllCharacters(){
        return characterService.getAllCharacters();
    }
}
