package pl.kurs.java.lesson10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DrugDealerServiceTest {
    private DrugDealerService drugDealerService;
    private List<DrugDealer> drugDealers;
    private DrugDealer longestWorkingDealer;

    @BeforeEach
    void setUp() {
        drugDealerService = new DrugDealerService();
        List<Drug> drugList = new ArrayList<>();
        Drug d1 = new Drug("Weed", 40, 5, 0.2);
        Drug d2 = new Drug("Coke", 300, 1, 0.3);
        Drug d3 = new Drug("2CB", 220, 0.5, 0.9);
        Drug d4 = new Drug("LSD", 30, 0.0001, 1);
        drugList.add(d1);
        drugList.add(d2);
        drugList.add(d3);
        drugList.add(d4);

        List<Drug> drugList2 = new ArrayList<>();
        Drug d5 = new Drug("Weed", 40, 5, 0.2);
        Drug d6 = new Drug("Coke", 100, 1, 0.3);
        Drug d7 = new Drug("2CB", 220, 1.5, 0.9);
        Drug d8 = new Drug("LSD", 30, 0.0001, 0.4);
        drugList2.add(d5);
        drugList2.add(d6);
        drugList2.add(d7);
        drugList2.add(d8);


        drugDealers = new ArrayList<>();
        DrugDealer dd1 = new DrugDealer("Michał", "Rzeszów", 14, 24, drugList);
        longestWorkingDealer = dd1;
        DrugDealer dd2 = new DrugDealer("Kacper", "Stalowa Wola", 20, 24, drugList2);
        DrugDealer dd3 = new DrugDealer("Maciej", "Rzeszów", 14, 21, drugList);
        drugDealers.add(dd1);
        drugDealers.add(dd2);
        drugDealers.add(dd3);
    }

    @Test
    public void getNameOfCityWithHighestNumberOfDealersTestCorrect() {
        String expected = "Rzeszów";

        String actual = drugDealerService.getNameOfCityWithHighestNumberOfDealers(drugDealers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getLongestWorkingDealerTestCorrect() {
        DrugDealer expected = longestWorkingDealer;

        DrugDealer actual = drugDealerService.getLongestWorkingDealer(drugDealers);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getBestDrugTestCorrect() {
        Drug expected = drugDealers.get(0).getDrugsList().get(3);

        Drug actual = drugDealerService.getBestDrug(drugDealers);

        Assertions.assertEquals(expected, actual);
    }

}
