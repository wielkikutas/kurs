package pl.kurs.java.lesson9.zadankozautkami;

public class Car {
   private String marka;
   private String model;
   private double przebieg;
   private int moc;
   private int rocznik;
   private double pojemnosc;
   private String typNadwozia;

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    public int getMoc() {
        return moc;
    }

    public int getRocznik() {
        return rocznik;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public String getTypNadwozia() {
        return typNadwozia;
    }

    public Car(String marka, String model, double przebieg, int moc, int rocznik, double pojemnosc, String typNadwozia) {
        this.marka = marka;
        this.model = model;
        this.przebieg = przebieg;
        this.moc = moc;
        this.rocznik = rocznik;
        this.pojemnosc = pojemnosc;
        this.typNadwozia = typNadwozia;
    }
}
/*1. stworz klase Car o polach:
        - marka
        - model
        - przebieg
        - moc
        - rocznik
        - pojemnocs
        - typNadwozia (ENUM)*/