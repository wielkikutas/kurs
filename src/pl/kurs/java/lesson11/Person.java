package pl.kurs.java.lesson11;

public class Person {
    private String surname;
    private String name;
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

    public Person(String surname, String name, String city, int age) {
        this.surname = surname;
        this.name = name;
        this.city = city;
        this.age = age;
    }
}
