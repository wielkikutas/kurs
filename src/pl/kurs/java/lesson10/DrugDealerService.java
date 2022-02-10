package pl.kurs.java.lesson10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DrugDealerService {
    public String getNameOfCityWithHighestNumberOfDealers(List<DrugDealer> drugDealers) {
        Map<String, Integer> dealersMap = new HashMap<>();
        for (DrugDealer drugDealer : drugDealers) {
            if (dealersMap.containsKey(drugDealer.getCity())) {
                dealersMap.put(drugDealer.getCity(), dealersMap.get(drugDealer.getCity()) + 1);
            } else {
                dealersMap.put(drugDealer.getCity(), 1);
            }
        }

        Map.Entry<String, Integer> maxValueEntry = null;
        for (Map.Entry<String, Integer> entry : dealersMap.entrySet()) {
            if (maxValueEntry == null || maxValueEntry.getValue() < entry.getValue()) {
                maxValueEntry = entry;
            }
        }

        if (maxValueEntry == null) {
            return "chuj";
        }
        return maxValueEntry.getKey();
    }

    public DrugDealer getLongestWorkingDealer(List<DrugDealer> drugDealers) {
        double longestWorkingHoursByFar = 0;
        DrugDealer longestWorkingDealer = null;
        for (DrugDealer drugDealer : drugDealers) {
            if (drugDealer.getEndHour() - drugDealer.getStartHour() > longestWorkingHoursByFar) {
                longestWorkingHoursByFar = drugDealer.getEndHour() - drugDealer.getStartHour();
                longestWorkingDealer = drugDealer;
            }

        }
        return longestWorkingDealer;
    }

    public Drug getBestDrug(List<DrugDealer> drugDealers) {
        List<Drug> allDrugs = new ArrayList<>();
        for (DrugDealer drugDealer : drugDealers) {
            allDrugs.addAll(drugDealer.getDrugsList());
        }

        Drug bestDrugATM=null;
        for (Drug allDrug : allDrugs) {
            if ( bestDrugATM==null|| allDrug.getPrice()<bestDrugATM.getPrice()){
                bestDrugATM=allDrug;
            }
        }
        return bestDrugATM;
    }
}
/* napisz DrugDealserService i napsi metody

znajdujaca w kortym miescie jest najwiercej dealerow

zamnjdaujacca najczesciej wystepujacy drug

znajdujaca najdluzej pracuajcaego deqalerra

napisz metode ktora z listy drug dealerow znajdzie najleoszy drug (najelpszy drug to taki ktory: ma najlespzy stosunekl ceny do jakosci (wymysl jak to liczyc))

i napisz TESTY KURWA

i dopisz pozostale testy do JobOfferService i JobApplicationService

 */