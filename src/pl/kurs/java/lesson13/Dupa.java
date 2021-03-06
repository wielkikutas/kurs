package pl.kurs.java.lesson13;

import zadankazdupy.nowazdupyklasa.main;

import java.io.File;
import java.io.IOException;

public class Dupa {
    public static void main(String[] args) throws IOException {
        Point pointer1 =new Point(1,1);
        Point pointer2 =new Point(39,39);
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
//        mz.returnPoints(array, pointer1, pointer2);
        JpgMazeService jpgmg= new JpgMazeService();
        int[][] ints = jpgmg.returnArrayPointsFromJpg(new File("274520970_380078240784689_660472508237077566_n.png"));

        mz.returnPoints(ints,pointer1,pointer2);

    }
}
