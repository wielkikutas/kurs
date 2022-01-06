package pl.kurs.java.lesson7;

public class Item {
    String name;
    String category;
    int price;

    public Item(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + category + " " + price + "$";
    }
}
