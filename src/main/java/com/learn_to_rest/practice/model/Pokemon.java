package com.learn_to_rest.practice.model;

public class Pokemon
{
    private String  pokemonId;
    private String  pokemonName;
    private String  pokemonStats;
    private int  pokemonHealth;
    private int  pokemonLevel;

    public Pokemon() {
        //Need empty constructor
    }

    public Pokemon(String pokemonId, String pokemonName, String pokemonStats, int pokemonHealth, int pokemonLevel) {
        this.pokemonId = pokemonId;
        this.pokemonName = pokemonName;
        this.pokemonStats = pokemonStats;
        this.pokemonHealth = pokemonHealth;
        this.pokemonLevel = pokemonLevel;
    }

    // Getters/Setters Methods
    public String getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(String pokemonId) {
        this.pokemonId = pokemonId;
    }

    public int getPokemonLevel() {
        return pokemonLevel;
    }

    public void setPokemonLevel(int pokemonLevel) {
        this.pokemonLevel = pokemonLevel;
    }

    public int getPokemonHealth() {
        return pokemonHealth;
    }

    public void setPokemonHealth(int pokemonHealth) {
        this.pokemonHealth = pokemonHealth;
    }

    public String getPokemonStats() {
        return pokemonStats;
    }

    public void setPokemonStats(String pokemonStats) {
        this.pokemonStats = pokemonStats;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

}
