package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DvdTest {
    Dvd new_Dvd;
    Movie starwars;
    @BeforeEach
    void setUp() {
        //setting up a dvd containing starwars movie under children catego
        starwars = new Movie("starwars",CategoryInterpreter.CHILDRENS);
        new_Dvd = new Dvd("12", starwars);

    }

    @Test
    void getSerialNumber() {
        assertEquals(new_Dvd.getSerialNumber(),"12");
    }

    @Test
    void getMovieName() {
        assertEquals(new_Dvd.getMovieName(), starwars);
    }
}