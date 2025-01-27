package com.learn_to_rest.practice.controller;

import com.learn_to_rest.practice.model.Pokemon;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokemon")
public class PokemonController
{

    Pokemon pokemon;

    @GetMapping("{pokemonId}")
    public String getPokemonById(@PathVariable String pokemonId)
    {
        // Create pokemon details will be entered into this object and same values returned
        return "Pokemon with ID" + pokemonId + "Retrieved Successfully";

    }

    @PostMapping
    public String createPokemonDetails(@RequestBody Pokemon pokemon)
    {
        this.pokemon = pokemon;
        return "Pokemon created successfully";
    }

    @PutMapping
    public String updatePokemonDetails(@RequestBody Pokemon pokemon)
    {
        this.pokemon = pokemon;
        return "Pokemon updated successfully";
    }

    @DeleteMapping("/{pokemonId}")
    public String deletePokemonDetails(@PathVariable String pokemonId)
    {
        return "Pokemon with ID" + pokemonId + "Deleted Successfully";
    }
}
