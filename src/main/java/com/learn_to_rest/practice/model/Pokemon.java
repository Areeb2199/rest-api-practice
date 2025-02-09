package com.learn_to_rest.practice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

// Using Lombok to avoid boilerplate code
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pokemon")
public class Pokemon
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  pokemonId;

    @Column(name = "pokemon_name")
    private String  pokemonName;

    @Column(name = "pokemon_stats")
    private String  pokemonStats;

    @Column(name = "pokemon_health")
    private int  pokemonHealth;

    @Column(name = "pokemon_level")
    private int  pokemonLevel;

}
