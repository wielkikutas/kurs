package pl.kurs.java.lesson5.zadanie;

import java.util.List;

public class JobOffer {//no i robimy znowu klase co ma konstrukt czy cos
    String city;//rozne rodzaje zmiennych
    int salary;
    int expReq;
    List<String> skills;//tworzyme jakoms liste stringow o nazwie skills

    public JobOffer(String city, int salary, int expReq, List<String> skills) {//no i jaks kolejny nie wie, m co ale cos robi
        this.city = city;
        this.salary = salary;
        this.expReq = expReq;
        this.skills = skills;
    }
}
//stworz klase JobOffer ktora będzie miec pola miasto, oferownaa placa,
// wymagane doświadczneie w latach i zestaw skilli (lista sttringow np: [java, sql, spring])