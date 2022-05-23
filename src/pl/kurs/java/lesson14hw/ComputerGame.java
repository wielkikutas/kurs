package pl.kurs.java.lesson14hw;

public class ComputerGame {
private String title;
private String producent;
private double price;
private String type;
private int agebound;

    public ComputerGame(String title, String producent, double price, String type, int agebound) {
        this.title = title;
        this.producent = producent;
        this.price = price;
        this.type = type;
        this.agebound = agebound;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAgebound() {
        return agebound;
    }

    public void setAgebound(int agebound) {
        this.agebound = agebound;
    }
}
