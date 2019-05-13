package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentalTest {
    Movie jungle = new Movie("jungle",CategoryInterpreter.NEW_RELEASE);
    BluRay br = new BluRay("12",jungle);
    Rental rental = new Rental(br,10);
    @Test
    void getBluray_request() {
        //equal t0 1 as bluray is requested by customer
        assertEquals(rental.getBluray_request(),1);
    }

    @Test
    void getDvd() {
        assertEquals(rental.getDvd(),null);
    }

    @Test
    void getDays() {
        assertEquals(rental.getDays(),10);
    }

    @Test
    void getBluray() {
        assertEquals(rental.getBluray(),br);
    }
}