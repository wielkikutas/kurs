package pl.kurs.java.lesson15;

import pl.kurs.java.lesson13.Point;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MazeService {
    private int[][] mazeArray;
    private Pointer start;
    private Pointer end;

    public MazeService(int[][] mazeArray, Pointer start, Pointer end) {
        this.mazeArray = mazeArray;
        this.start = start;
        this.end = end;
    }

    public void printSolvedMaze() {
        List<Pointer> solutionPoints = getSolutionPoints();
        for (int i = 0; i < mazeArray.length; i++) {
            for (int i1 = 0; i1 < mazeArray[i].length; i1++) {
                if (containsPoint(solutionPoints, i, i1)) {
                    System.out.print("\u001B[31m" + mazeArray[i][i1] + " " + "\u001B[0m");
                } else {
                    System.out.print(mazeArray[i][i1] + " ");
                }
            }
        }
    }

    private boolean containsPoint(List<Pointer> solutionPoints, int i, int i1) {
        for (Pointer solutionPoint : solutionPoints) {
            if (solutionPoint.getX() == i1 && solutionPoint.getY() == i) {
                return true;
            }
        }
        return false;
    }

    private Map<String, Boolean> getDirectionsForPoint(Pointer point) {
        Map<String, Boolean> directions = new HashMap<>();
        directions.put("UP", 0 <= point.getY() - 1 && point.getY() - 1 < mazeArray.length);
        directions.put("DOWN", 0 <= point.getY() + 1 && point.getY() + 1 < mazeArray.length);
        directions.put("RIGHT", 0 <= point.getX() + 1 && point.getX() + 1 < mazeArray.length);
        directions.put("LEFT", 0 <= point.getX() - 1 && point.getX() - 1 < mazeArray.length);

        return directions;
    }

    private List<Pointer> getSolutionPoints() {
        List<Pointer> currentPoints = new ArrayList<>();
        currentPoints.add(start);
        boolean isSolved = false;
        while (!isSolved) {
            List<Pointer> currentPointsTemp = new ArrayList<>();
            for (Pointer currentPoint : currentPoints) {
                if (currentPoint.equals(end)) {
                    isSolved = true;
                    break;
                }
                Map<String, Boolean> directions = getDirectionsForPoint(currentPoint);
                for (Map.Entry<String, Boolean> entry : directions.entrySet()) {
                    if (entry.getValue()) {
                        String key = entry.getKey();
                        switch (key) {
                            case "UP":
                                currentPointsTemp.add(new Pointer(currentPoint.getX(), currentPoint.getY() - 1));
                                break;
                            case "DOWN":
                                currentPointsTemp.add(new Pointer(currentPoint.getX(), currentPoint.getY() + 1));
                                break;
                            case "RIGHT":
                                currentPointsTemp.add(new Pointer(currentPoint.getX() + 1, currentPoint.getY()));
                                break;
                            case "LEFT":
                                currentPointsTemp.add(new Pointer(currentPoint.getX() - 1, currentPoint.getY()));
                                break;
                        }
                    }
                }
            }
            currentPoints = new ArrayList<>(currentPointsTemp);
            currentPointsTemp.clear();
        }

        List<Pointer> solution = new ArrayList<>();
        solution.add(end);
        return solution;


    }
}
