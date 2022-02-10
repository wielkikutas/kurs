package pl.kurs.java.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DrugService {
    public Drug getCheapestDrug(List<Drug> drugs) {
        Drug cheapestDrugATM = null;
        for (Drug drug : drugs) {
            if (cheapestDrugATM == null || cheapestDrugATM.getPrice() > drug.getPrice()) {
                cheapestDrugATM = drug;
            }
        }
        return cheapestDrugATM;
    }

    public double countAverageWeedQuality(List<Drug> drugs) {
        int counter = 0;
        double qualitySum = 0;
        for (Drug drug : drugs) {
            if (drug.getName().equalsIgnoreCase("Weed")) {
                qualitySum += drug.getQualityPercent();
                counter++;
            }
        }
        return qualitySum / counter;
    }

    public double countMeanOfWeight(List<Drug> drugs) {
        int listSizeMid = 0;
        List<Double> lista = new ArrayList<>();
        for (Drug drug : drugs) {
            lista.add(drug.getWeight());
        }
        Collections.sort(lista);
        if (lista.size() % 2 == 1) {
            listSizeMid = lista.size() / 2;
            return lista.get(listSizeMid);
        } else {
            listSizeMid = lista.size() / 2;
            return (lista.get(listSizeMid) + lista.get(listSizeMid + 1)) / 2;
        }
    }

    public int countSumOfVowels(List<Drug> drugs) {
        int sumOfVowels = 0;
        List<Character> vowels = List.of('a', 'o', 'y');
        for (Drug drug : drugs) {
            for (char ch : drug.getName().toCharArray()) {
                if (vowels.contains(ch)) {
                    sumOfVowels++;
                }
            }
        }
 return sumOfVowels;
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