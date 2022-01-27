package zadankazdupy.nowazdupyklasa.klasazadnkojeszczeraztosamo;

import javax.swing.*;
import java.util.List;

public class JobOffer {
    private String city;
    private int salary;
    private int expRequired;
    private List<String> skills;

    public String getCity() {
        return city;
    }

    public int getSalary() {
        return salary;
    }

    public int getExpRequired() {
        return expRequired;
    }

    public List<String> getSkills() {
        return skills;
    }

    public JobOffer(String city, int salary, int expRequired, List<String> skills) {
        this.city = city;
        this.salary = salary;
        this.expRequired = expRequired;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "JobOffer{" +
                "city='" + city + '\'' +
                ", salary=" + salary +
                ", expRequired=" + expRequired +
                ", skills=" + skills +
                '}';
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