package pl.kurs.java.lesson13;

import pl.kurs.java.lesson15.Pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MazeService {

    public List<Point> returnPoints(int[][] array, Point start, Point end) {
        List<Point> borderPoints = new ArrayList<>();
        List<Point> borderPointers = new ArrayList<>();
        borderPoints.add(start);
        int[][] newArray = Arrays.stream(array).map(int[]::clone).toArray(int[][]::new);
        int counter = 2;
        boolean solved = false;
        while (!solved) {
            for (Point borderPoint : borderPoints) {
                newArray[borderPoint.getX()][borderPoint.getY()] = counter;

                if (borderPoint.getX() == end.getX() && borderPoint.getY() == end.getY()) {
                    solved = true;
                    break;
                }
                if (newArray[borderPoint.getX()][borderPoint.getY() - 1] == 0) {
                    borderPointers.add(new Point(borderPoint.getX(), borderPoint.getY() - 1));
                }
                if (newArray[borderPoint.getX()][borderPoint.getY() + 1] == 0) {
                    borderPointers.add(new Point(borderPoint.getX(), borderPoint.getY() + 1));
                }
                if (newArray[borderPoint.getX() - 1][borderPoint.getY()] == 0) {
                    borderPointers.add(new Point(borderPoint.getX() - 1, borderPoint.getY()));
                }
                if (newArray[borderPoint.getX() + 1][borderPoint.getY()] == 0) {
                    borderPointers.add(new Point(borderPoint.getX() + 1, borderPoint.getY()));
                }
            }
            counter++;
            borderPoints = new ArrayList<>(borderPointers);
            borderPointers.clear();
        }

//        for (int[] ints : newArray) {
//            for (int anInt : ints) {
//                System.out.print(anInt + "  ");
//            }
//            System.out.println();
//        }

        boolean solved2 = false;
        List<Point> solutionPoints = new ArrayList<>();
        solutionPoints.add(end);

        int currentPointValue = newArray[end.getY()][end.getX()];
        Point currentPoint = end;

        while (!solved2) {
            if (currentPoint.equals(start)) {
                solved2 = true;
                break;
            }
            currentPointValue--;
            if (newArray[currentPoint.getY()][currentPoint.getX() - 1] == currentPointValue) {
                currentPoint = new Point(currentPoint.getX() - 1, currentPoint.getY());
            }
            if (newArray[currentPoint.getY()][currentPoint.getX() + 1] == currentPointValue) {
                currentPoint = new Point(currentPoint.getX() + 1, currentPoint.getY());
            }
            if (newArray[currentPoint.getY() - 1][currentPoint.getX()] == currentPointValue) {
                currentPoint = new Point(currentPoint.getX(), currentPoint.getY() - 1);
            }
            if (newArray[currentPoint.getY() + 1][currentPoint.getX()] == currentPointValue) {
                currentPoint = new Point(currentPoint.getX(), currentPoint.getY() + 1);
            }
            solutionPoints.add(currentPoint.copy());
        }

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                if (containsPoint(solutionPoints, i, i1)) {
                    System.out.print("\u001B[31m" + array[i][i1] + " " + "\u001B[0m");
                } else {
                    System.out.print(array[i][i1] + " ");
                }
            }
            System.out.println();
        }
        return solutionPoints;
    }

    private boolean containsPoint(List<Point> solutionPoints, int i, int i1) {
        for (Point solutionPoint : solutionPoints) {
            if (solutionPoint.getX() == i1 && solutionPoint.getY() == i) {
                return true;
            }
        }
        return false;
    }
}
