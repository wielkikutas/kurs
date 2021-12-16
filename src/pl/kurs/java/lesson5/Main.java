package pl.kurs.java.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.name = "Duap";
//        p1.surname = "DUpa2";
//        p1.age = 69;
//
//        Person p2 = new Person();
//        p2.surname = "dsad";
//
//        Person p3 = new Person("Maciek", "G", 10);
//        System.out.println(p3.name);
//
//        Person p4 = new Person("Namea", "Dupa");
//        System.out.println(p4.age);
//
//        List<Person> people = new ArrayList<>();
//        people.add(p1);
//        people.add(p2);

//        for (Person person : people) {
//            System.out.println(person.surname + " " + person.name);
//        }

        // stworz klase telewizor, zrob kilka tv i wrzuc na liste i z tej listy znajdz najwiekszy telewizor

//        Tv t1 = new Tv("Samsubg", 13210, 105);
//        Tv t2 = new Tv("lg", 1031, 101);
//        Tv t3 = new Tv("hyundai", 12310, 1450);
//        Tv t4 = new Tv("oled", 1310, 10312);
//        List<Tv> telewziorki = new ArrayList<>();
//        telewziorki.add(t1);
//        telewziorki.add(t2);
//        telewziorki.add(t3);
//        telewziorki.add(t4);
//
//        Tv biggestTv = null;
//        for (Tv tv : telewziorki) {
//            if (biggestTv == null || biggestTv.size < tv.size) {
//                biggestTv = tv;
//            }
//        }
//
//        if (biggestTv != null) {
//            System.out.println(biggestTv.brand);
//        } else {
//            System.out.println("ty chuju lista jesy pista");
//        }
//
//        List<Integer> ints = List.of(1, 2, 3, 10, 20, 1);
//        int maxInt = 0;
//        for (Integer anInt : ints) {
//            if (maxInt < anInt) {
//                maxInt = anInt;
//            }
//        }
//        System.out.println(maxInt);

        // zrob klase osoba ktora bedzie miec jako pole liste imion znajmoych,
        // wypisz na kosnosle wszystkie imiona o dlugosci powyzej 5
        List<String> friends2 = new ArrayList<>();
        friends2.add("jarekfsda");
        friends2.add("dare");
        friends2.add("WAcek");




        List<String> friends1 = new ArrayList<>();
        friends1.add("Maciek");
        friends1.add("Maciek");
        friends1.add("WAcek");

        Osoba o1 = new Osoba(friends1);
        Osoba o2 = new Osoba(friends2);

        List<Osoba> osoby = new ArrayList<>();
        osoby.add(o1);
        osoby.add(o2);

        for (Osoba osoba : osoby) {
            List<String> friends = osoba.friends;
            for (String friend : friends) {
                if (friend.length()>5){
                    System.out.println(friend);
                }
            }
        }
    }
}
