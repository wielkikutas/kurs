package zadankazdupy.nowazdupyklasa.klasazadnkojeszczeraztosamo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JobOfferServiceTest {
    private JobOfferService jobOfferService;
    private List<JobOffer> jobOffers;


    @BeforeEach
    void setUp() {
        jobOfferService = new JobOfferService();
        jobOffers = new ArrayList<>();

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

    }

    @Test
    public void getBiggestSalaryOfferTestCorrect() {
        // given
        JobOffer expected = jobOffers.get(2);

        // when
        JobOffer actual = jobOfferService.getBiggestSalaryOffer(jobOffers);

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBiggestSalaryOfferTestGivenNull() {
        // when
        JobOffer actual = jobOfferService.getBiggestSalaryOffer(null);

        // then
        Assertions.assertNull(actual);
    }

    @Test
    public void getBiggestSalaryOfferTestGivenEmptyList() {
        // when
        JobOffer actual = jobOfferService.getBiggestSalaryOffer(new ArrayList<>());

        // then
        Assertions.assertNull(actual);
    }

//    @Test
//    public void getBiggestSalaryOfferTestGivenListWithNull() {
//        // given
//        JobOffer expected = new JobOffer("Kraków", 15000, 4, List.of("chujCipa"));
//
//        // when
//        JobOffer actual = jobOfferService.getBiggestSalaryOffer(new ArrayList<>(List.of(expected, null)));
//
//        // then
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void countInCityTest() {
        // given
        long expected = 2;

        // when
        long actual = jobOfferService.countInCity(jobOffers, "Warszawa");

        // then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getCitiesSetTest() {
        //given
        List<String> expected = List.of("Warszawa", "Rzeszów", "Kraków");

        //when
        List<String> actual = jobOfferService.getCitiesSet(jobOffers);

        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAverageMinExpTest(){
        //given
        double expected=5.5;

        //when
        double actual= jobOfferService.getAverageMinExp(jobOffers);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void getMostPopularSkillTest(){
        //given
        String expected = "Java";
        //when
        String actual = jobOfferService.getMostPopularSkill(jobOffers);
        //then
        Assertions.assertEquals(expected,actual);
    }
}