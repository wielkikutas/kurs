package pl.kurs.java.lesson5.zadanie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobApplicationService {

    public Map<String, Integer> getCitiesCount(List<JobApplication> jobApplications) {
        Map<String, Integer> cityMap = new HashMap<>();
        for (JobApplication jobApplication : jobApplications) {
            String city = jobApplication.city;
            if (cityMap.containsKey(city)) {
                cityMap.put(city, cityMap.get(city) + 1);
            } else {
                cityMap.put(city, 1);

            }
        }

        return cityMap;
    }

    public Map<String, Long> getEmailsCount(List<JobApplication> jobApplications) {
        Map<String, Long> eMailMap = new HashMap<>();
        for (JobApplication jobApplication : jobApplications) {
            String eMail = jobApplication.eMail;
            if (eMailMap.containsKey(eMailMap)) {
                eMailMap.put(eMail, eMailMap.get(eMail) + 1);
            } else {
                eMailMap.put(eMail, 1L);
            }
        }
        return eMailMap;
    }
}
        //i tu chyba sie gubie
        // o ile wg to u gury jest dobrze
//    return eMailMap;}
//    public String getMostFreqSkill(List<JobApplication> jobApplications){ //znajdz najczessciej wystepujacy skill{
//        String
//
//        }
//    }
//} //zlicza ilosc wystapien kazdego z maili, np (test@test.pl : 2, itp)

//    public Map<String, Long> getEmailsCount(List<JobApplication> jobApplications){
//        Map<String,Long> eMailMap = new HashMap<>();
//        for (JobApplication jobApplication : jobApplications) {
//            for (String email : jobApplication.eMail) {
//                if
//
//            }
//
//        }
//    }
//}
//
//
//    public String getMostPopularSkill(List<JobOffer> jobOffers) {
//        Map<String, Integer> skillsMap = new HashMap<>();//tworze jakoms mape o nazwie skillsMap ktorej kluczem som  stringi a wartosci calkowite
//        for (JobOffer jobOffer : jobOffers) {//iteruje dla kazdego elemnetu z jobOffers
//            for (String skill : jobOffer.skills) {//dla kazdego skilla z jobOffer
//                if (skillsMap.containsKey(skill)) {//sorawdzany czy ten skill jest na naszej mapie
//                    skillsMap.put(skill, skillsMap.get(skill) + 1);//jak juz jest to dodajemy do danego klucza wartosc o 1 wienkszom
//                } else {
//                    skillsMap.put(skill, 1);//a jezeli nie to poprostu dodajemy do tej mapy element z wartoscia jeden poniewaz dopiero bd 1 raz na naszejj mapie
//                }
//    nastepnie zrob JobApplicationService, ktory bedzie mial nastepyujace metody:
//
//    public Map<String, Long> getCitiesCount(List<JobApplication> jobApplications) zlicza ilośc wystąpnien miast, np (krakow : 5, warszawa : 10, rzeszow 2, itp)
//
//
//    public Map<String, Long> getEmailsCount(List<JobApplication> jobApplications) zlicza ilosc wystapien kazdego z maili, np (test@test.pl : 2, itp)
//
//
//    public String getMostFreqSkill(List<JobApplication> jobApplications) znajdz najczessciej wystepujacy skill
//
//
//    public List<JobApplication> validate(List<JobApplication> jobApplications) znajdz oferty błędne, błędne czyli takie ktore:
//    z jednego maila dostaliśmy dwie aploikacje z tym samym imieniem. Czyli z jednego maila moze przyjsc kilka roznych ofert, ale jezeli przyjdzie wiecej niz jedna z tym samym imieniem to jest to bledna apliakcja
// */


//    public Map<String, Long> getCitiesCount(List<JobApplication> jobApplications) {
//        int miastoMaczet = 0;
//        int miastoSyrenki = 0;
//        int miastoMaćka = 0;
//        for (JobApplication jobApplication : jobApplications) {
//            if (jobApplication.city = "Krakow")
//                miastoMaczet++;
//            else if (jobApplication.city = "Warszawa")
//                miastoSyrenki++;
//            else
//                miastoMaćka++;
//
//
//        }
//        public Map<String, Long> getEmailsCount (List < JobApplication > jobApplications) {
//            //i tu ni chuja nie wiem co dac
//        }
//        public String getMostFreqSkill (List < JobApplication > jobApplications) {
//            jobApplications.skill
//        }
//        public List<JobApplication> validate (List < JobApplication > jobApplications) {
//            if (jobApplications.email begins with )
//        }
//    }



