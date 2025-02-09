package com.learn_to_rest.practice.repository;

import com.learn_to_rest.practice.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>
{
    // all crud DB methods to interact with the DB

}
