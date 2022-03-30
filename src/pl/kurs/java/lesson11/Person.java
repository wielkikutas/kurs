package pl.kurs.java.lesson11;

public class Person {
    private String name;
    private String surname;
    private String city;
    private int age;

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }
}
