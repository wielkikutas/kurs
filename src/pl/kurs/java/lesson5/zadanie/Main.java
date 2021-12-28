package pl.kurs.java.lesson5.zadanie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        JobApplicationService applicationService= new JobApplicationService();
        JobOfferService offerService = new JobOfferService();
        List<JobApplication> jobApplications = new ArrayList<>();
        jobApplications.add(
                new JobApplication("dupa",123,"Stalowa","882711559",true,
                        "zbydniowiak4@gmail.com",0,List.of("Java", "Chuj")));
        List<JobOffer> jobOffers = new ArrayList<>();


        List<String> skills1 = new ArrayList<>();
        skills1.add("Java");
        skills1.add("MySql");
        skills1.add("Spring");

        List<String> skills2 = new ArrayList<>();
        skills2.add("Java");
        skills2.add("Hibernate");

        jobOffers.add(new JobOffer("Warszawa", 10000, 4, skills1));
        jobOffers.add(new JobOffer("Rzeszów", 7000, 4, skills2));
        jobOffers.add(new JobOffer("Warszawa", 30000, 10, skills2));
        jobOffers.add(new JobOffer("Kraków", 15000, 4, skills1));

        JobOffer biggestSalaryOffer = offerService.getBiggestSalary(jobOffers);
        Map<String,Integer> cityMap= applicationService.getCitiesCount(jobApplications);
        long countCities = offerService.countInCity(jobOffers, "Warszawa");

        System.out.println(countCities);
        System.out.println(biggestSalaryOffer.salary);
        System.out.println(cityMap);

//        Map<String, Integer> myMap = new HashMap<>();
//        myMap.put("Warszawa", 2000000);
//        myMap.put("Berlin", 4000000);
//        myMap.put("Berlin", 5000000);
//
//        int berlinPopulation = myMap.get("Berlin");
    }
}

/*
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
