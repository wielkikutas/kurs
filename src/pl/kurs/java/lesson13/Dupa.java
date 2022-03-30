package pl.kurs.java.lesson13;

import zadankazdupy.nowazdupyklasa.main;

public class Dupa {
    public static void main(String[] args) {
        Point pointer1 =new Point(1,1);
        Point pointer2 =new Point(9,9);
        int[][] array = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1},
                {1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1},
                {1, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        MazeService mz = new MazeService();
        mz.returnPoints(array, pointer1, pointer2);
    }
}
