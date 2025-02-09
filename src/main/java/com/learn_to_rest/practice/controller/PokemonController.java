package com.learn_to_rest.practice.controller;

import com.learn_to_rest.practice.model.Pokemon;
import com.learn_to_rest.practice.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController
{

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping
    public List<Pokemon> getAllPokemon() {
        return pokemonRepository.findAll();
    }

}
