package com.company;

public class BluRay {
    private String serialNumber;
    private Movie movieName;

    public BluRay(String serialNo, Movie movie) {
        this.serialNumber = serialNo;
        this.movieName = movie;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public Movie getMovieName() {
        return movieName;
    }
}
