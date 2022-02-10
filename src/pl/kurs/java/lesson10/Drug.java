package pl.kurs.java.lesson10;

public class Drug {
    private String name;
    private double price;
    private double weight;
    private double qualityPercent;


    public Drug(String name, double price, double weight, double qualityPercent) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.qualityPercent = qualityPercent;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getQualityPercent() {
        return qualityPercent;
    }
}
/*

zrob klase Drug(name (dla urpyoszczenia niech beda tylko "Weed", "Coke", "2CB", "LSD"), price, weight, qualityPercent)
i zrob klase DrugDealer(name, city, startHour, endHour, drugsList)

i bnapisz drugService ktory ma miec metody:
znajdz z listy drugow nahjtanszy

znajdz z listy drugow srednia quality percent dla zielska

znajdz z lsity drugow mediane weight

znajdz z lsity drugow, a konkretnie jej nazw ilosc samoglosek!

i napisz DrugDealserService i napsi metody

znajdujaca w kortym miescie jest najwiercej dealerow!

zamnjdaujacca najczesciej wystepujacy drug!

znajdujaca najdluzej pracuajcaego deqalerra

napisz metode ktora z listy drug dealerow znajdzie najleoszy drug (najelpszy drug to taki ktory: ma najlespzy stosunekl ceny do jakosci (wymysl jak to liczyc))!

i napisz TESTY KURWA!

i dopisz pozostale testy do JobOfferService i JobApplicationService!
 */