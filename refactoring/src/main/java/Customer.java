package com.company;
import java.util.ArrayList;
import org.apache.commons.lang3.*;
public class Customer {
    private String customerName;
    private ArrayList<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.customerName = name;
    }

    public ArrayList<Rental> getRentals() {
        return rentals;
    }


    public String getName() {
        return customerName;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getStatement() {
        double balance = 0.0;
        int rewardPoints = 0;
        CategoryInterpreter movieCategory=null;
        String statement = "Rental Statement For "+customerName+"\n";
        double currentRent;
        for(Rental rental: rentals){
            currentRent = 0;
            if(rental.getBluray_request()==0)
                movieCategory = rental.getDvd().getMovieName().getMovieCategory();
            else
                movieCategory = rental.getBluray().getMovieName().getMovieCategory();

            currentRent += movieCategory.rentCalculator(rental.getDays(),rental.getBluray_request());
            rewardPoints++;
            balance += currentRent;

            if(movieCategory==CategoryInterpreter.NEW_RELEASE && rental.getDays()>2)
                rewardPoints++;
            if(rental.getBluray_request()==0)
                statement += "\t" + rental.getDvd().getMovieName()+ "\t" + currentRent + "\n";
            else
                statement += "\t" + rental.getBluray().getMovieName()+ "\t" + currentRent + "\n";
        }
        statement += "Balance is " + balance + "\n\tYou earned " + rewardPoints + " reward points";
        String unEscapedString = "<html><h4><java>Your balance is: "+balance+"</java></h4></html>";
        return statement;
    }
}

