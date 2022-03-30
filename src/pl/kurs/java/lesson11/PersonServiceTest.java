package pl.kurs.java.lesson11;

import org.junit.jupiter.api.Assertions;
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
        Person p1 = new Person("Jessica","Gajór","Rzeszów",22);
        Person p2 = new Person("Maciej","Toprzechuj","Rzeszów",23);
        Person p3 = new Person("Pjoter","Najważniejszy","Berlin",23);
        Person p4 = new Person("Maria","Ten","Rzeszów",23);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

    }

    @Test
    public void returnsOldestWomanTest() {
        Person expected=personList.get(3);
        Person actual= personService.returnsOldestWoman(personList);
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void  getAverageOfAgeTest(){
        double expected=22.75;
        double actual=personService.getAverageOfAge(personList);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void getAverageOfMenAgeTest(){
        double expected = 22.75;
        double actual=personService.getAverageOfAge(personList);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void getMeanOfWoMenAgeTest(){
        double expected = 22.5;
        double actual= personService.getMeanOfWoMenAge(personList);
        Assertions.assertEquals(expected,actual);
    }
}
