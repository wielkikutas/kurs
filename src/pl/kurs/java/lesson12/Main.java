package pl.kurs.java.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(3);
        Triangle triangle = new Triangle(4 ,7);

        List<GeometricFigure> geometricFigures = new ArrayList<>();
        geometricFigures.add(circle);
        geometricFigures.add(square);
        geometricFigures.add(triangle);

        for (GeometricFigure geometricFigure : geometricFigures) {
            System.out.println(geometricFigure.getArea());
            System.out.println(geometricFigure.getPerimeter());
        }
    }
}
