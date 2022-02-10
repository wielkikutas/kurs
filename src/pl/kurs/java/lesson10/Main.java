package pl.kurs.java.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drug>drugList= new ArrayList<>();
        Drug d1 = new Drug("Weed",40,5,0.2);
        Drug d2 = new Drug("Coke",300,1,0.3);
        Drug d3 = new Drug("2CB",220,0.5,0.9);
        Drug d4 = new Drug("LSD",30,0.0001,1);
        drugList.add(d1);
        drugList.add(d2);
        drugList.add(d3);
        drugList.add(d4);

        List<Drug>drugList2= new ArrayList<>();
        Drug d5 = new Drug("Weed",40,5,0.2);
        Drug d6 = new Drug("Coke",100,1,0.3);
        Drug d7 = new Drug("2CB",220,1.5,0.9);
        Drug d8 = new Drug("LSD",30,0.0001,0.4);
        drugList.add(d5);
        drugList.add(d6);
        drugList.add(d7);
        drugList.add(d8);



        List<DrugDealer>drugDealerList=new ArrayList<>();
        DrugDealer dd1 = new DrugDealer("Michał","Rzeszów",14,24,drugList);
        DrugDealer dd2 = new DrugDealer("Kacper","Stalowa Wola",20,24,drugList2);
    }


        }
