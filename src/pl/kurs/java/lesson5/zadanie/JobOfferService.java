package pl.kurs.java.lesson5.zadanie;

import java.util.ArrayList;
import java.util.List;

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
        List<String> cities = new ArrayList<>();
        for (JobOffer jobOffer : jobOffers) {
            String city = jobOffer.city;
            if(!cities.contains(city)){
            cities.add(city);
            }
        }
        return cities;
    }

//    public double getAverageMinExp(List<JobOffer> jobOffers) {
////        JobOffer getAverageMinExp = null;
////        int averageExp=0;
////        int lowestExp=100;
////        for (JobOffer jobOffer : jobOffers) {
////            averageExp=+jobOffer.expReq;
////            if (jobOffer.expReq<lowestExp)
////                lowestExp=jobOffer.expReq;
////
////        }
////        averageExp=averageExp/jobOffers.size();
////    return getAverageMinExp,averageExp,lowestExp;
//    }

//    public String getMostPopularSkill(List<JobOffer> jobOffers) {
////        JobOffer getMostPopularSkill = null;
////        for (JobOffer jobOffer : jobOffers) {
////            jobOffer.skills
////
////        }
////    return getMostPopularSkill;
//    }

//    public JobApplication getBestApplication(List<JobOffer> jobOffers) {
////        JobOffer getBestApplication = null;
////        for (JobOffer jobOffer : jobOffers) {
////
////
////        }
////        return  getBestApplication;
//    }
}
