package zadankazdupy.nowazdupyklasa.klasazadnkojeszczeraztosamo;

import java.util.List;

public class JobApplication {
    private String name;
    private int salaryExpected;
    private String city;
    private int telehoneNum;
    private boolean relocationPositive;
    private String eMail;
    private int expInYears;

    public String getName() {
        return name;
    }

    public int getSalaryExpected() {
        return salaryExpected;
    }

    public String getCity() {
        return city;
    }

    public int getTelehoneNum() {
        return telehoneNum;
    }

    public boolean isRelocationPositive() {
        return relocationPositive;
    }

    public String geteMail() {
        return eMail;
    }

    public int getExpInYears() {
        return expInYears;
    }

    public List<String> getSkillsSet() {
        return skillsSet;
    }

    private List<String> skillsSet;

    public JobApplication(String name, int salaryExpected, String city, int telehoneNum, boolean relocationPositive, String eMail, int expInYears, List<String> skillsSet) {
        this.name = name;
        this.salaryExpected = salaryExpected;
        this.city = city;
        this.telehoneNum = telehoneNum;
        this.relocationPositive = relocationPositive;
        this.eMail = eMail;
        this.expInYears = expInYears;
        this.skillsSet = skillsSet;
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