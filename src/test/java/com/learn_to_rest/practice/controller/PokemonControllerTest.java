package com.learn_to_rest.practice.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.mockito.Mockito.when;

@WebMvcTest(PokemonController.class)
public class PokemonControllerTest {

    @Autowired
    private MockMvc mockMvc; // To perform HTTP requests and test controller

    @MockBean
    private PokemonController pokemonController;  // Mock the controller

    @BeforeEach
    public void setUp() {
        // You can mock the controller methods here, like so:
        when(pokemonController.getPokemonById("1")).thenReturn("Pokemon with ID 1 Retrieved Successfully");
    }

    @Test
    public void testGetPokemonById() throws Exception {

        // Arrange to set up the data, already done in setUp()

        // Act: Make a GET request to test the Pokemon retrieval
        mockMvc.perform(MockMvcRequestBuilders.get("/pokemon/1")) // Perform the HTTP request

                // Assert
                .andExpect(MockMvcResultMatchers.status().isOk()) // Assert the status is 200 OK
                .andExpect(MockMvcResultMatchers.content().string("Pokemon with ID 1 Retrieved Successfully")); // Assert the returned content
    }


}
