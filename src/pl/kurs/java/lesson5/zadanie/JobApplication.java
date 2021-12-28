package pl.kurs.java.lesson5.zadanie;//jakas sciezka pakietu

import java.util.List;//chuj wie co to robi

public class JobApplication {//se robie klase o nazwie job application i ona wg
    // ma taki rodzaj public co musi byc public zeby inne klasy mogly po niej dziedziczyć czy coś
    String name; //i takie cos dajemy i to chuj wie co to ale deklarujemyjakies naame stringa a to wg jest jakis konstrukt cy cos
    int salary; //no i takie salary
    String city;//i city
    String phoneNo;//i numer telefonu
    boolean relocationPositive;//i jakies cos tam o roznych zmiennych true false string i jakas lista stringuf tam w 14 l
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