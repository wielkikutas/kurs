package pl.kurs.java.lesson10;

import java.util.List;

public class DrugDealer {
    private String name;
    private String city;
    private double startHour;
    private double endHour;
    private List<Drug> drugsList;


    public DrugDealer(String name, String city, double startHour, double endHour, List<Drug> drugsList) {
        this.name = name;
        this.city = city;
        this.startHour = startHour;
        this.endHour = endHour;
        this.drugsList = drugsList;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getStartHour() {
        return startHour;
    }

    public double getEndHour() {
        return endHour;
    }

    public List<Drug> getDrugsList() {
        return drugsList;
    }
}
/*

zrob klase Drug(name (dla urpyoszczenia niech beda tylko "Weed", "Coke", "2CB", "LSD"), price, weight, qualityPercent)
i zrob klase DrugDealer(name, city, startHour, endHour, drugsList)

i bnapisz drugService ktory ma miec metody:
znajdz z listy drugow nahjtanszy

znajdz z listy drugow srednia quality percent dla zielska

znajdz z lsity drugow mediane weight

znajdz z lsity drugow, a konkretnie jej nazw ilosc samoglosek

i napisz DrugDealserService i napsi metody

znajdujaca w kortym miescie jest najwiercej dealerow

zamnjdaujacca najczesciej wystepujacy drug

znajdujaca najdluzej pracuajcaego deqalerra

napisz metode ktora z listy drug dealerow znajdzie najleoszy drug (najelpszy drug to taki ktory: ma najlespzy stosunekl ceny do jakosci (wymysl jak to liczyc))

i napisz TESTY KURWA

i dopisz pozostale testy do JobOfferService i JobApplicationService
 */