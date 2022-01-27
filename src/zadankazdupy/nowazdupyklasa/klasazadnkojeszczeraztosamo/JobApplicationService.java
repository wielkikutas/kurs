package zadankazdupy.nowazdupyklasa.klasazadnkojeszczeraztosamo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobApplicationService {

    public Map<String,Integer> getCitiesCount(List<JobApplication> jobApplications){
        Map<String, Integer> cityMap= new HashMap<>();
        for (JobApplication jobApplication : jobApplications) {
            String city = jobApplication.getCity();
            if (cityMap.containsKey(city)){
                cityMap.put(city, cityMap.get(city)+1);
            }else {
                cityMap.put(city,1);

            }
        }

        return cityMap;
    }

    public Map<String, Long> getEmailsCount(List<JobApplication> jobApplications){
        Map<String, Long> eMailMap = new HashMap<>();
        for (JobApplication jobApplication : jobApplications) {
            String eMail = jobApplication.geteMail();
            if (eMailMap.containsKey(eMailMap)) {
                eMailMap.put(eMail, eMailMap.get(eMail) + 1);
            } else {
                eMailMap.put(eMail, 1L);
            }
        }
        return eMailMap;
    }

    public String getMostFreqSkill(List<JobApplication> jobApplications){
        for (JobApplication jobApplication : jobApplications) {
            for (JobApplication application : jobApplications) {

            }

        }
        return null;
    }
}
   /* nastepnie zrob JobApplicationService, ktory bedzie mial nastepyujace metody:

public Map<String, Long> getCitiesCount(List<JobApplication> jobApplications) zlicza ilośc wystąpnien miast, np (krakow : 5, warszawa : 10, rzeszow 2, itp)


public Map<String, Long> getEmailsCount(List<JobApplication> jobApplications) zlicza ilosc wystapien kazdego z maili, np (test@test.pl : 2, itp)


public String getMostFreqSkill(List<JobApplication> jobApplications) znajdz najczessciej wystepujacy skill


public List<JobApplication> validate(List<JobApplication> jobApplications) znajdz oferty błędne, błędne czyli takie ktore:
        z jednego maila dostaliśmy dwie aploikacje z tym samym imieniem. Czyli z jednego maila moze przyjsc kilka roznych ofert, ale jezeli przyjdzie wiecej niz jedna z tym samym imieniem to jest to bledna apliakcja
        */