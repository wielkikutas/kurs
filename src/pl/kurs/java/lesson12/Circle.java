package pl.kurs.java.lesson12;

public class Circle implements GeometricFigure {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * r;
    }
}
