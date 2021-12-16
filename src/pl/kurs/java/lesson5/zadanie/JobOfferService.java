package pl.kurs.java.lesson5.zadanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobOfferService {
    public JobOffer getBiggestSalary(List<JobOffer> jobOffers) {
        JobOffer biggestSalaryOffer = null; // tworzymy obiekt do ktorego mozwmy potem porownywac
        for (JobOffer jobOffer : jobOffers) { // iteracja przez liste ofert pracy
            if (biggestSalaryOffer == null /*msuimy sprawdzic czy nie jest nullem bo jezeli na nullu wywolasz cokolwiek to sie wyjbie*/ || jobOffer.salary > biggestSalaryOffer.salary) { // sprawdzenie wwarunku czy ta oferta ma lepsza pensje
                biggestSalaryOffer = jobOffer; // jezeli ta oferta (jobOffer) ma lepsza pensje to przypisujemy do tego obiektu ktory sluzy nam do porownywania
            }
        }
        return biggestSalaryOffer; // po przejsciu przez cala liste mamy wynik ktory zwracamy
    }

    public long countInCity(List<JobOffer> jobOffers, String city) {
        long counter = 0; // twrozymy licznik do liczenia wysatpien
        for (JobOffer jobOffer : jobOffers) { // liciemy przez wszykite oferty
            if (jobOffer.city.equals(city)) { // sprawdzamy czy miasto z oferty jest z miasta poazdanego
                counter++; // inkrmentujemy licznik
            }
        }
        return counter; // po przejsciu przez petele mamy wynik ktory zwracamy
    }

    public List<String> getCitiesSet(List<JobOffer> jobOffers) {
        List<String> cities = new ArrayList<>(); // tworzymy pusta liste stringow ktora bedzie trzyamc wszysktie miasta bez powtorzen
        for (JobOffer jobOffer : jobOffers) { // lecimy przez lsite ofert
            String city = jobOffer.city; // przypisujemy do zmiennej city miasto z oferty
            if (!cities.contains(city)) { // sprawdzamy czy lista NIE zaweira tego miasta
                cities.add(city); // jezeli nie zaweira to dodajemy do listy
            }
        }
        return cities; // po petli mam ywynik
    }

    public double getAverageExp(List<JobOffer> jobOffers) {
        int exp = 0;
        for (JobOffer jobOffer : jobOffers) {
            exp += jobOffer.expReq;
        }

        return exp / (double) jobOffers.size();
    }

    public String getMostPopularSkill(List<JobOffer> jobOffers) {
        Map<String, Integer> skillsMap = new HashMap<>();//tworze jakoms mape o nazwie skillsMap ktorej kluczem som  stringi a wartosci calkowite
        for (JobOffer jobOffer : jobOffers) {//iteruje dla kazdego elemnetu z jobOffers
            for (String skill : jobOffer.skills) {//dla kazdego skilla z jobOffer
                if (skillsMap.containsKey(skill)) {//sorawdzany czy ten skill jest na naszej mapie
                    skillsMap.put(skill, skillsMap.get(skill) + 1);//jak juz jest to dodajemy do danego klucza wartosc o 1 wienkszom
                } else {
                    skillsMap.put(skill, 1);//a jezeli nie to poprostu dodajemy do tej mapy element z wartoscia jeden poniewaz dopiero bd 1 raz na naszejj mapie
                }
            }
        }

        Map.Entry<String, Integer> maxValueEntry = null; // tworzymy obiekt do ktorego mozwmy potem porownywac
        for (Map.Entry<String, Integer> entry : skillsMap.entrySet()) {// iteracja przez entry set
            String key = entry.getKey(); // pobranie klucza
            int value = entry.getValue(); // pobeanie warotsci
            if (maxValueEntry == null /*msuimy sprawdzic czy nie jest nullem bo jezeli na nullu wywolasz cokolwiek to sie wyjbie*/
                    || value > maxValueEntry.getValue()) { // sprawdzenie wwarunku czy ta oferta ma lepsza pensje
                maxValueEntry=entry; // jezeli to entry ma wieksza value to przypisujemy do tego obiektu ktory sluzy nam do porownywania
            }
        }

        if (maxValueEntry == null) {
            return null;
        }
        return maxValueEntry.getKey();
    }

//    public JobApplication getBestApplication(List<JobOffer> jobOffers) {
////        JobOffer getBestApplication = null;
////        for (JobOffer jobOffer : jobOffers) {
////
////
////        }
////        return  getBestApplication;
//    }
}
