package com.learn_to_rest.practice;

import com.learn_to_rest.practice.model.Pokemon;
import com.learn_to_rest.practice.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner {

	public static void main(String[] args)
	{
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Autowired
	private PokemonRepository pokemonRepository;

	// Run method executes whenever SB starts for the first time
	@Override
	public void run(String... args) throws Exception {
			Pokemon pokemon = new Pokemon(); // new obj of pokemon
			pokemon.setPokemonName("Pikachu");
			pokemon.setPokemonLevel(1000);
			pokemon.setPokemonHealth(10000);
			pokemon.setPokemonStats("Legendary");
			pokemonRepository.save(pokemon); // saving new pokemon obj to the database

			Pokemon pokemon1 = new Pokemon(); // new obj of pokemon
			pokemon1.setPokemonName("Bulbasur");
			pokemon1.setPokemonLevel(500);
			pokemon1.setPokemonHealth(5000);
			pokemon1.setPokemonStats("Strong");
			pokemonRepository.save(pokemon1); // saving new pokemon obj to the database

			Pokemon pokemon2 = new Pokemon(); // new obj of pokemon
			pokemon2.setPokemonName("Babsi");
			pokemon2.setPokemonLevel(696969);
			pokemon2.setPokemonHealth(696969696);
			pokemon2.setPokemonStats("ULTRA LEGEND");
			pokemonRepository.save(pokemon2); // saving new pokemon obj to the database

	}
}
