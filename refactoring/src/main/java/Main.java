package com.company;

// This file is only for our demo purpose to check system's work
public class Main {
    public static void main(String s[]){
        Movie jungle = new Movie("jungle",CategoryInterpreter.CHILDRENS);
        Registry registrys = new Registry();
        registrys.addMovie(CategoryInterpreter.CHILDRENS,jungle);

        BluRay br = new BluRay("12",jungle);
        Rental rent = new Rental(br,10);
        Rental rent2 = new Rental(br,10);
        Customer cs = new Customer("Harsh");
        cs.addRental(rent);
        cs.addRental(rent2);
        String ss  = cs.getStatement();
        System.out.println(ss);
    }
}
