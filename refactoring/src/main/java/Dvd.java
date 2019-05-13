public class Dvd {
    private String serialNumber;
    private Movie movieName;

    public Dvd(String serialNo, Movie movie) {
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
