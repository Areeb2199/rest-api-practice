package com.learn_to_rest.practice.controller;

import com.learn_to_rest.practice.model.pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController
{

    @GetMapping("{pokemonId}")
    public pokemon getPokemonById(String pokemonId)
    {
        return new pokemon("1", "Dialga",
                "Strong", 1000, 1000000);

    }

}
