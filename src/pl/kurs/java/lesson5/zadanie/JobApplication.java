package pl.kurs.java.lesson5.zadanie;

import java.util.List;

public class JobApplication {
    String name;
    int salary;
    String city;
    String phoneNo;
    boolean relocationPositive;
    String eMail;
    int exp;
    List<String> skills;

    public JobApplication(String name, int salary, String city, String phoneNo, boolean relocationPositive,
                          String eMail, int exp, List<String> skills) {
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.phoneNo = phoneNo;
        this.relocationPositive = relocationPositive;
        this.eMail = eMail;
        this.exp = exp;
        this.skills = skills;
    }
}
//stworz klase JobApplication ktora bedzie miec imie, pozadana placa, miasto,
// nr tele, czy gosc jest chetny na relokacje, email, lata doświadcznenia,
// i zestaw skilli (lista sttringow np: [java, sql, spring])