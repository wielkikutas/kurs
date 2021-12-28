package pl.kurs.java.lesson6;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        int[]userInts =metodaCoZwracaTabliceDziesieciuLiczb();
        System.out.println(metodaCoZwracaNajwieksza(userInts));
        System.out.println(metodaCoZwracaNajmniejsza(userInts));
        System.out.println(metodaCoZwracaSume(userInts));
//        int[] tablicaIntow1 = metodaCoZwracaTabliceDziesieciuLiczb();
//        int[] tablicaIntow2 = metodaCoZwracaTabliceDziesieciuLiczb();
//        int[] tablicaIntow3 = metodaCoZwracaTabliceDziesieciuLiczb();
//        int[] chuj = metodaCoZwracaTabliceDziesieciuLiczb();
//        int maxIntFromTavlicaIntow1= metodaCoZwracaNajwieksza(tablicaIntow1);
//        int maxIntFromTavlicaIntow2= metodaCoZwracaNajwieksza(tablicaIntow2);
//        int maxIntFromTavlicaIntow3= metodaCoZwracaNajwieksza(tablicaIntow3);
//        int maxIntFromChuj = metodaCoZwracaNajwieksza(chuj);
    }

    public static int[] metodaCoZwracaTabliceDziesieciuLiczb() {
        Scanner skanerek = new Scanner(System.in);
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("podaj liczbe");
            ints[i] = skanerek.nextInt();

        }
        return ints;
    }

    public static int metodaCoZwracaNajwieksza(int[] dowolnaTablivaIntow) {
        int najwieksza=Integer.MIN_VALUE;
        for (int i : dowolnaTablivaIntow) {
            if(i>najwieksza){
                najwieksza=i;
            }

        }
return najwieksza;
    }

    public static int metodaCoZwracaNajmniejsza(int[] dowolnaTablicaIntow){
        int najmniejsza=Integer.MAX_VALUE;
        for (int i:dowolnaTablicaIntow){
            if(i<najmniejsza){
                najmniejsza=i;
            }
        }
        return najmniejsza;
    }

    public static int metodaCoZwracaSume(int[] dowolnaTablicaIntow){
        int suma=0;
        for (int i : dowolnaTablicaIntow) {
            suma+=i;


        }
        return suma;
    }

}
/*
Zadanie 01.
        Za pomocą scannera zapytaj użytkownika o 10 liczb a następnie:
        - wypisz największą z nich
        - wypisz najmniejszą z nich
        - wypisz sume wprowadzonych liczb
        - wypisz ile liczb pierwszych wprowadzil uzytkownik (liczba pierwsza to taka liczba ktora ma dokladnie 2 dzielniki, nie wiecej i nie mniej)

        Zadanie 02.
        Przeprowadź symulację działania duzego lotka metodą wybił trafił.
        Komputer losuje 6 losowych, niepowtarzajacych sie liczb z zakresu 1-49
        te liczby zapisujemy w tablicy losowanie.

        nastepnie komputer losuje ponownie 6 losowych liczb niepowtarzajacych sie z zakresu 1-49, tak dlugo az trafi 6stke
        while(iloscTrafien != 6) (podpowiedz)
        policz ile musialo sie odbyc razy takie losowanie i odpowiedz sobie na pytanie czy warto grac w totka czy uczyc sie programowania 😉

        Zadanie 03
        Za pomoca scannera popros uzytkownika o podanie wyrazu.
        Wypisz pierwszy i ostatni znak.
        nastepnie sprawdz czy podany wyraz jest palindromem,
        palindrom to wyraz ktory od przodu i od tylu czyta sie tak samo np: kajak lub kamilślimak

        Zadanie 04.
        Wypisz wszystkie liczby 3 cyfrowe ktorych suma cyfr dziesiatek i setek jest rowna cyfrze jednosci np: 112 bo 1+1 == 2.
        */