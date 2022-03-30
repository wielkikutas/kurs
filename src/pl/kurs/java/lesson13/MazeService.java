package pl.kurs.java.lesson13;

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
        boolean solved2 = false;
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

        for (int[] ints : newArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
        List<Point> solutionPoints = new ArrayList<>();
        int solutionX = end.getX();
        int solutionY = end.getY();
        int i = newArray[end.getX()][end.getY()];
        solutionPoints.add(end);
        while (!solved2) {
            i--;
            if (newArray[solutionX - 1][solutionY] == i) {
                solutionX--;
                solutionPoints.add(new Point(solutionX, solutionY));
            }else if(newArray[solutionX][solutionY-1] == i){
                solutionY--;
                solutionPoints.add(new Point(solutionX, solutionY));

            }else if(newArray[solutionX+1][solutionY]==i){
                solutionX++;
                solutionPoints.add(new Point(solutionX, solutionY));

            }else if(newArray[solutionX][solutionY+1]==i){
                solutionY++;
                solutionPoints.add(new Point(solutionX, solutionY));
            }
                if (solutionX== start.getX()&&solutionY==start.getY()){
                    solved2=true;
                }

        }


        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }


        return null;
    }
}
