package pl.kurs.java.lesson14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JobOfferService {

    public JobOffer getHighestSalaryOffer(List<JobOffer> jobOfferList) {
 /*       JobOffer highestSalaryOffer = null;
        for (JobOffer jobOffer : jobOfferList) {
            if (highestSalaryOffer == null || highestSalaryOffer.getSalary() <= jobOffer.getSalary()) {
                highestSalaryOffer = jobOffer;
            }
        }
        return highestSalaryOffer;
*/
        return jobOfferList.stream().max(Comparator.comparingInt(JobOffer::getSalary)).orElse(null);

    }

    public long countCity(List<JobOffer> jobOfferList, String city) {
    /*    int counter=0;
        for (JobOffer jobOffer : jobOfferList) {
            if (jobOffer.getCity().equalsIgnoreCase(city)){
                counter++;
            }
        }
        return counter;*/
        return jobOfferList.stream().filter(jobOffer -> jobOffer.getCity().equalsIgnoreCase(city)).count();
    }

    public Map<String, Long> countAllCities(List<JobOffer> jobOfferList) {
       /* Map<String,Integer> mapaMiast=new HashMap<>();
        for (JobOffer jobOffer : jobOfferList) {
            if (mapaMiast.containsKey(jobOffer.getCity())){
                mapaMiast.put(jobOffer.getCity(),mapaMiast.get(jobOffer.getCity())+1);
            }else {
                mapaMiast.put(jobOffer.getCity(),1);
            }
        }*/
        return jobOfferList.stream().map(JobOffer::getCity).collect(Collectors.groupingBy(o -> o, Collectors.counting()));
    }}

//    public String getMostCommonSkill(List<JobOffer> jobOfferList) {
      /*  Map<String, Long> skillsMap = new HashMap<>();
        for (JobOffer jobOffer : jobOfferList) {

            for (String skill : jobOffer.getSkills()) {
                if (skillsMap.containsKey(skill)) {
                    skillsMap.put(skill, skillsMap.get(skill) + 1);
                } else {
                    skillsMap.put(skill, 1L);
                }
            }
        }
        Map.Entry<String, Long> maxValueEntry = null;
        for (Map.Entry<String, Long> entryEntry : skillsMap.entrySet()) {
            if (maxValueEntry == null || entryEntry.getValue() >= maxValueEntry.getValue()) {
                maxValueEntry = entryEntry;
            }
        }
        if (maxValueEntry == null) {
            return "HWDP";
        }
        return maxValueEntry.getKey();*/
/*return jobOfferList.stream().map(JobOffer::getSkills).collect(Collectors.groupingBy(o -> o, Collectors.counting()));*/
    /*}
}*/
/*zrub to sturumieniem no i potem tak zrob jeszcze klase ymmm gra komputerowa ktora ma nastempujonce pola tyt
ul producent cena gatunek dozwolony wiek
 a nastepnie zrob servie co bd miec nastepujace metody
 znajdz wszystkie gry dostempne dla osob miedzy 13 a 16 rokiem zycia
 znajdz wszystkie gry o podanym gatunku
 znajdz sredia cene gier
 policz ilosc samoglosek we wszyskich nazwach producentow gier
 znajdz gre ktora zawiera podanego przez urzytkownika stringa */