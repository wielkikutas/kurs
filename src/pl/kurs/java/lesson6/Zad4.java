package pl.kurs.java.lesson6;

public class Zad4 {
    public static void main(String[] args) {
        int x = 0;//liczba jednosci
        int y = 0;//liczba dziesiatek
        int z = 0;// liczba setek

        for (int i = 100; i < 1000; i++) {
            x = i % 10;
            y = ((i % 100) - x) / 10;
            z = ((i % 1000) - y - x) / 100;//cos tu jest zjebaane z tym zetem ale dziaua
            if (y + z == x) {


                System.out.println(i);
            }
        }


    }
}
/*  Zadanie 04.
          Wypisz wszystkie liczby 3 cyfrowe ktorych suma cyfr dziesiatek i setek jest rowna cyfrze jednosci np: 112 bo 1+1 == 2.
          */