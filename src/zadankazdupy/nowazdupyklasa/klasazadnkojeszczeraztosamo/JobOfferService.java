package zadankazdupy.nowazdupyklasa.klasazadnkojeszczeraztosamo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobOfferService {
    public JobOffer getBiggestSalaryOffer(List<JobOffer> jobOffers) {
        JobOffer biggestSalaryOffer = null;
        if (jobOffers == null) {
            return null;
        }
        for (JobOffer jobOffer : jobOffers) {
            if (jobOffer == null){
                continue;
            }
            if (biggestSalaryOffer == null || biggestSalaryOffer.getSalary() < jobOffer.getSalary()) {
                biggestSalaryOffer = jobOffer;
            }
        }
        return biggestSalaryOffer;
    }

    public long countInCity(List<JobOffer> jobOffers, String city) {
        int counter = 0;
        for (JobOffer jobOffer : jobOffers) {
            if (jobOffer.getCity().equals(city)) {
                counter++;
            }
        }
        return counter;
    }

    public List<String> getCitiesSet(List<JobOffer> jobOffers) {
        List<String> cities = new ArrayList<>();
        for (JobOffer jobOffer : jobOffers) {
            String city = jobOffer.getCity();
            if (!cities.contains(city)) {
                cities.add(city);
            }
        }
        return cities;
    }

    public double getAverageMinExp(List<JobOffer> jobOffers) {
        int exp = 0;
        for (JobOffer jobOffer : jobOffers) {
            exp += jobOffer.getExpRequired();
        }

        return exp / (double) jobOffers.size();
    }

    public String getMostPopularSkill(List<JobOffer> jobOffers) {
        Map<String, Integer> skillsMap = new HashMap<>();
        for (JobOffer jobOffer : jobOffers) {
            for (String skill : jobOffer.getSkills()) {
                if (skillsMap.containsKey(skill)) {
                    skillsMap.put(skill, skillsMap.get(skill) + 1);
                } else {
                    skillsMap.put(skill, 1);
                }
            }
        }

        Map.Entry<String, Integer> maxValueEntry = null;
        for (Map.Entry<String, Integer> entry : skillsMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            if (maxValueEntry == null || value > maxValueEntry.getValue()) {
                maxValueEntry = entry;
            }
        }
        if (maxValueEntry == null) {
            return null;
        }
        return maxValueEntry.getKey();
    }
}/*
stworz klase JobOffer ktora będzie miec pola miasto, oferownaa placa, wymagane doświadczneie w latach i zestaw skilli (lista sttringow np: [java, sql, spring])
stworz klase JobApplication ktora bedzie miec imie, pozadana placa, miasto, nr tele, czy gosc jest chetny na relokacje, email, lata doświadcznenia, i zestaw skilli (lista sttringow np: [java, sql, spring])

nastepnie zrob JobOfferService, ktory bedzie miał nastepujace metody:
    public JobOffer getBiggestSalary(List<JobOffer> jobOffers) znajduje z listy oferte o najwyzsazej pensji

    public long countInCity(List<JobOffer> jobOffers, String city) liczy ile jest ofert z danego miasta (city)

    public List<String> getCitiesSet(List<JobOffer> jobOffers) znajduje wszystkie miasta z ofert (różne, czyli maja sie nie powtarzac)

    public double getAverageMinExp(List<JobOffer> jobOffers) znajduje srednie minimalne doswiadczenie z ofert z listy

    public String getMostPopularSkill(List<JobOffer> jobOffers) znajdz najpopularniejszy skill z ofert z listy (czyli ten ktory wystepuje najczesniej)

    public JobApplication getBestApplication(JobOffer jobOffer, List<JobApplication> jobApplications) (znajdz z listy aplikacji o prace NAJLEPSZA dla danej oferty)


	nastepnie zrob JobApplicationService, ktory bedzie mial nastepyujace metody:

	    public Map<String, Long> getCitiesCount(List<JobApplication> jobApplications) zlicza ilośc wystąpnien miast, np (krakow : 5, warszawa : 10, rzeszow 2, itp)


    public Map<String, Long> getEmailsCount(List<JobApplication> jobApplications) zlicza ilosc wystapien kazdego z maili, np (test@test.pl : 2, itp)


    public String getMostFreqSkill(List<JobApplication> jobApplications) znajdz najczessciej wystepujacy skill


    public List<JobApplication> validate(List<JobApplication> jobApplications) znajdz oferty błędne, błędne czyli takie ktore:
	z jednego maila dostaliśmy dwie aploikacje z tym samym imieniem. Czyli z jednego maila moze przyjsc kilka roznych ofert, ale jezeli przyjdzie wiecej niz jedna z tym samym imieniem to jest to bledna apliakcja
 */

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