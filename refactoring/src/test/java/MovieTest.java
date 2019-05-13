package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    Movie starwars = new Movie("starwars",CategoryInterpreter.CHILDRENS);
    @Test
    void getName() {
        assertEquals(starwars.getName(),"starwars");
    }

    @Test
    void getMovieCategory() {
        assertEquals(starwars.getMovieCategory(),CategoryInterpreter.CHILDRENS);
    }
}