package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistryTest {
    Registry registry = new Registry();

    @Test
    void addMovie() {
        Movie mowgli = new Movie("Mowgli",CategoryInterpreter.CHILDRENS);
        registry.addMovie(CategoryInterpreter.CHILDRENS,mowgli);
        assertEquals(1,registry.get(CategoryInterpreter.CHILDRENS).size());
    }

    @Test
    void get() {
        Movie mowgli = new Movie("Mowgli",CategoryInterpreter.CHILDRENS);
        registry.addMovie(CategoryInterpreter.CHILDRENS,mowgli);
        assertEquals(1,registry.get(CategoryInterpreter.CHILDRENS).size());
    }
}