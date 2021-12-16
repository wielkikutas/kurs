package pl.kurs.java.lesson5;

public class Person {
    String name;
    String surname;
    int age;

    public Person(){

    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        age = 999;
    }
}
