package pl.kurs.java.lesson5.zadanie;

import java.util.List;

public class JobOffer {
    String city;
    int salary;
    int expReq;
    List<String> skills;

    public JobOffer(String city, int salary, int expReq, List<String> skills) {
        this.city = city;
        this.salary = salary;
        this.expReq = expReq;
        this.skills = skills;
    }
}
//stworz klase JobOffer ktora będzie miec pola miasto, oferownaa placa,
// wymagane doświadczneie w latach i zestaw skilli (lista sttringow np: [java, sql, spring])