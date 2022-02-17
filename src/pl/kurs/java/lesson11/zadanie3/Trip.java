package pl.kurs.java.lesson11.zadanie3;

public class Trip {
    private int godzinawylotu;
    private int dzienwylotu;
    private int miesiacwylotu;
    private int godzinapowrotu;
    private int dzienpowrotu;
    private int miesiacpowrotu;
    String country;
    int hotelStandard;
    double baseprise;

    public int getGodzinawylotu() {
        return godzinawylotu;
    }

    public int getDzienwylotu() {
        return dzienwylotu;
    }

    public int getMiesiacwylotu() {
        return miesiacwylotu;
    }

    public int getGodzinapowrotu() {
        return godzinapowrotu;
    }

    public int getDzienpowrotu() {
        return dzienpowrotu;
    }

    public int getMiesiacpowrotu() {
        return miesiacpowrotu;
    }

    public String getCountry() {
        return country;
    }

    public int getHotelStandard() {
        return hotelStandard;
    }

    public double getBaseprise() {
        return baseprise;
    }

    public Trip(int godzinawylotu, int dzienwylotu, int miesiacwylotu, int godzinapowrotu, int dzienpowrotu, int miesiacpowrotu, String country, int hotelStandard, double basePrice) {
        this.godzinawylotu = godzinawylotu;
        this.dzienwylotu = dzienwylotu;
        this.miesiacwylotu = miesiacwylotu;
        this.godzinapowrotu = godzinapowrotu;
        this.dzienpowrotu = dzienpowrotu;
        this.miesiacpowrotu = miesiacpowrotu;
        this.country = country;
        this.hotelStandard = hotelStandard;
        this.baseprise = basePrice;
    }
}
