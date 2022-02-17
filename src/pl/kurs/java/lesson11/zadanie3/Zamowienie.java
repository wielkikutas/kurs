package pl.kurs.java.lesson11.zadanie3;

public class Zamowienie {
    private String name;
    private int standard;
    private int numberOfTravelers;

    public String getName() {
        return name;
    }

    public int getStandard() {
        return standard;
    }

    public int getNumberOfTravelers() {
        return numberOfTravelers;
    }

    public Zamowienie(String name, int standard, int numberOfTravelers) {
        this.name = name;
        this.standard = standard;
        this.numberOfTravelers = numberOfTravelers;
    }
}
