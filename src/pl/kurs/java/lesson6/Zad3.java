package pl.kurs.java.lesson6;

import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String wyraz = sc.nextLine();
        char[] podzielonywyraz = wyraz.toCharArray();
        System.out.println(podzielonywyraz[0]);
        System.out.println(podzielonywyraz[podzielonywyraz.length-1]);
        int h=podzielonywyraz.length;
        int xd=0;
        int k=(h-1);
        for (int i = 0; i < h; i++) {
            if (podzielonywyraz[i] != podzielonywyraz[k]){
                xd=1;
                break;
            }
            k--;
        }
        if(xd==1){
            System.out.println("nie jest palindromem");
        }else {
            System.out.println("jest palindromem");
        }
    }
}
//Zadanie 03
//        Za pomoca scannera popros uzytkownika o podanie wyrazu.
//        Wypisz pierwszy i ostatni znak.
//        nastepnie sprawdz czy podany wyraz jest palindromem,
//        palindrom to wyraz ktory od przodu i od tylu czyta sie tak samo np: kajak lub kamilślimak