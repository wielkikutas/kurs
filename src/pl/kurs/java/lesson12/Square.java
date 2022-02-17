package pl.kurs.java.lesson12;

public class Square implements GeometricFigure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }
}
