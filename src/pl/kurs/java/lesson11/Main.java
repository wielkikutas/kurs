package pl.kurs.java.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList =new ArrayList<>();
        Person p1 = new Person("Jessica","Gajór","Rzeszów",22);
        Person p2 = new Person("Maciej","Toprzechuj","Rzeszów",23);
        Person p3 = new Person("Pjoter","Najważniejszy","Berlin",23);
        Person p4 = new Person("Marry","Ten","Rzeszów",23);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
    }
}
