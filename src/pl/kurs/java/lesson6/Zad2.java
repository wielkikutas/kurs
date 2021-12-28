package pl.kurs.java.lesson6;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Zad2 {
    public static void main(String[] args) {
double srednia = 0;
        for (int i = 0; i < 1000; i++) {
        int[] totek = metodaCoZwracaTotka();
            int srednia1 = metodaCoLiczyIloscProb(totek);
            System.out.println(srednia1);
            srednia += srednia1;

        }
        System.out.println(srednia / 1000);
    }

    public static int[] metodaCoZwracaTotka() {
        int[] tablica = new int[6];
        for (int i = 0; i < 6; i++) {
            int x = 0;
            boolean zawiera = false;
            do {
                x = ThreadLocalRandom.current().nextInt(1, 50);
                zawiera = false;
                for (int i1 : tablica) {
                    if (x == i1) {
                        zawiera = true;
                        break;
                    }
                }
            } while (zawiera);
            tablica[i] = x;
        }

        return tablica;
    }

    public static int metodaCoLiczyIloscProb(int[] mojTotek) {
    int iloscProb =0;
        while (true) {
            iloscProb++;
            int[] nowyTotek = metodaCoZwracaTotka();
            if (Arrays.equals(mojTotek, nowyTotek)) {
                break;
            }
        }
        return iloscProb;

    }
}

/*
Zadanie 02.
        Przeprowadź symulację działania duzego lotka metodą wybił trafił.
        Komputer losuje 6 losowych, niepowtarzajacych sie liczb z zakresu 1-49
        te liczby zapisujemy w tablicy losowanie.

        nastepnie komputer losuje ponownie 6 losowych liczb niepowtarzajacych sie z zakresu 1-49, tak dlugo az trafi 6stke
        while(iloscTrafien != 6) (podpowiedz)
        policz ile musialo sie odbyc razy takie losowanie i odpowiedz sobie na pytanie czy warto grac w totka czy uczyc sie programowania 😉
 */
