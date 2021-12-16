package pl.kurs.java.lesson5.zadanie;

import java.util.List;

public class JobOfferService {
    public JobOffer getBiggestSalary(List<JobOffer> jobOffers) {
        JobOffer biggestSalaryOffer = null;
        for (JobOffer jobOffer : jobOffers) {
            if (biggestSalaryOffer == null || jobOffer.salary > biggestSalaryOffer.salary) {
                biggestSalaryOffer = jobOffer;
            }
        }
        return biggestSalaryOffer;
    }

    public long countInCity(List<JobOffer> jobOffers, String city) {
        long counter =0;
        for (JobOffer jobOffer : jobOffers) {
            if(jobOffer.city.equals(city)){
                counter++;
            }
        }
        return counter;
    }

//    public List<String> getCitiesSet(List<JobOffer> jobOffers) {
////        JobOffer getCitiesSet = null;
////        for (JobOffer jobOffer : jobOffers) {
////            for (JobOffer offer : jobOffers) {
////                if (JobOffer jobOffer.city==offer.city)
////                    continue;
////            }else{
////                System.out.println(jobOffer.city);
////            }
////
////
////        }
////        return getCitiesSet;
//    }

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
