package pl.kurs.java.lesson11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.kurs.java.lesson10.DrugDealer;
import pl.kurs.java.lesson10.DrugDealerService;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceTest {
    private PersonService personService;
    private List<Person> personList;


    @BeforeEach
    void setUp() {
        personService = new PersonService();
        personList = new ArrayList<>();
//personList.add()
    }

    @Test
    public void returnsOldestWomanTest() {
//        Person expected

    }
}
