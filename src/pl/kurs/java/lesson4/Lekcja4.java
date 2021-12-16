package pl.kurs.java.lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lekcja4 {
    public static void main(String[] args) {

//        String[] strArray = new String[3];
//        strArray[0] = "dupa";
//        List<String> strList2 = new ArrayList<>();
//        strList2.add("t1");
//        strList2.add("t2");
//        strList2.add("t3");

        List<String> strList = new ArrayList<>();
        strList.add("dupa"); // dodawanie
        strList.add(0, "dupsko"); //dodawanie na index, przesuqa sie wszystko po
//        strList.addAll(strList2); // dodawanie całych kolekcji
//        strList.clear(); // czysci liste
        boolean contains = strList.contains("dupa"); // zwraca boola czy zawiera
        String s = strList.get(0);
        int indexOf = strList.indexOf("dupa");
        boolean empty = strList.isEmpty(); // zwraca boola czy lista jest pusta
//        strList.remove("dupa");
//        strList.remove(1);
//        strList.set(0, "hfjsdk");
        int size = strList.size(); // zwraca wiekosc listy

        Set<String> strSet = new HashSet<>();
        strSet.add("dupa");
        strSet.add("dupa");
        strSet.add("dupa");
        strSet.add("dupa");
        strSet.add("dupa");

      //d List<Integer> intList = new ArrayList<>();

        // powtorka
        // zrobic zadania z uzyciem lsit i setów

        /*

       napisz program ktory z listy intow znajdzie najmniejszy i najwiekszy,
        nastepnie je doda i wyswietli wynik ORAZ znajdzie dla nich najwiekszy wspolny dzielnik NND
         */
    }
}
