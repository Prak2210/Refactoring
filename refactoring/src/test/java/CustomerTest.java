package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer prakshat;
    Rental rent;
    @BeforeEach
    void setUp() {
        Movie jungle = new Movie("jungle",CategoryInterpreter.CHILDRENS);
        BluRay br = new BluRay("12",jungle);
        rent = new Rental(br,10);
        prakshat = new Customer("Prakshat");
    }

    @Test
    void getName() {
        assertEquals(prakshat.getName(),"Prakshat");
    }

    @Test
    void addRental() {
        prakshat.addRental(rent);
        assertEquals(prakshat.getRentals().size(),1);
    }

    @Test
    void getStatement() {
        prakshat.addRental(rent);
        assertEquals(prakshat.getStatement(),"Rental Statement For Prakshat\n" +
                "\tjungle\t7.0\n" +
                "Balance is 7.0\n" +
                "\tYou earned 1 reward points");
    }
}