package pl.kurs.java.lesson12;

public class Triangle implements GeometricFigure {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h / 2.0;
    }

    @Override
    public double getPerimeter() {
        return a * 3;
    }
}
