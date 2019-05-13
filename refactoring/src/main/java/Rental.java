public class Rental {
    private Dvd dvd;
    private int days;
    private BluRay bluray;

    public int getBluray_request() {
        return bluray_request;
    }

    private int bluray_request = 0;

    public Rental(Dvd dvd, int days) {
        this.dvd = dvd;
        this.days = days;

    }

    public Rental(BluRay bluray, int days) {
        this.bluray = bluray;
        this.days = days;
        this.bluray_request =1;
    }

    public Dvd getDvd() {
        return dvd;
    }

    public int getDays() {
        return days;
    }

    public BluRay getBluray() {
        return bluray;
    }

}
