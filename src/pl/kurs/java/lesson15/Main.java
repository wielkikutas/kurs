package pl.kurs.java.lesson15;

import pl.kurs.java.lesson13.MazeService;

public class Main {
    public static void main(String[] args) {
        Pointer start = new Pointer(1, 1);
        Pointer end = new Pointer(1, 3);

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
//        MazeService mazeService=new MazeService(array,start,end);
//        mazeService.printSolvedMaze();
//        System.out.println(array[1][1]);
//        System.out.println(array[3][1]);


    }
}
