package pl.kurs.java.lesson9.zadankozautkami;

import pl.kurs.java.lesson5.zadanie.JobOffer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> listaAutek = new ArrayList<>();
        Car c1 = new Car("Fiat","punto",150000,85,2002,1.9,"Hatchback");
        Car c2 = new Car("Audi", "rs5", 50000, 450, 2021, 2.9, "Sportback");
        Car c3 = new Car("Mercedes", "A45AMG", 10000, 400, 2020, 2.0, "Hatchback");
        listaAutek.add(c1);
        listaAutek.add(c2);
        listaAutek.add(c3);

        CarService carService = new CarService();
        System.out.println(carService.methodThatReturnsSortedByHpCars(listaAutek));
    }
}
