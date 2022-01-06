package pl.kurs.java.lesson7;

import pl.kurs.java.lesson5.zadanie.JobApplication;

import java.util.*;

public class CoffeeShopApplication {
    Scanner scanner;
    List<Item> items;


    public CoffeeShopApplication() {
        items = new ArrayList<>();
        items.add(new Item("zielsko", "strain", 10));
        items.add(new Item("zielsk2", "strain", 10));
        items.add(new Item("zielsk3", "strain", 10));
        items.add(new Item("zielsk4", "strain", 10));
        items.add(new Item("zielsk5", "strain", 10));
        scanner = new Scanner(System.in);
    }

    public void run() {
        showMenu();
        System.out.println("podaj nr listy menu");
        int userChoice = scanner.nextInt();
        doUserChoice(userChoice);


    }

    private void showMenu() {
        System.out.println("1 kup");
        System.out.println("2 pokaz towar");
        System.out.println("3 pokaz towarz danej z danej kategorii");
        System.out.println("4 suma lacznych towarow");
        System.out.println("5 srednia cena");
    }

    public void doUserChoice(int userChoice) {

        switch (userChoice) {
            case 1:
                System.out.println(buy());
                break;
            case 2:
                showAllItemsWithIndex();
                break;
            case 3:
                showAllCategoriesWithIndex();
                break;
            case 4://suma towarow
                System.out.println(sumUpAllItems());
                break;
            case 5://srednia cena
                System.out.println(findMeanofAllItems());
                break;
        }
    }

    private void showAllCategoriesWithIndex() {
        Set<String> categories = new HashSet<>();
        for (Item item : items) {
            categories.add(item.category);
        }
        for (String category : categories) {
            System.out.println(category);
        }
    }

    public String buy() {
        showAllItemsWithIndex();
        System.out.println("podaj nr towaru");
        int numerTowaru = scanner.nextInt();

        Item i1 = items.get(numerTowaru - 1);
        items.remove(i1);
        return "brawo udalo ci sie kupic: " + i1;
    }

    public void showAllItemsWithIndex() {
        int i = 0;
        for (Item item : items) {
            i++;
            System.out.println(i + ". " + item);
        }
    }
    public Integer sumUpAllItems(){
        int sum=0;
        for (Item item : items) {
        sum +=item.price;
        }
        return sum;
    }
    public Integer findMeanofAllItems(){
        int mean=0;
        int sum=0;
        for (Item item : items) {
            sum+= item.price;
        }
        mean=sum/ items.size();
        return mean;
    }
}
