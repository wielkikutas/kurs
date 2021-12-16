package pl.kurs.java.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Zad41 {
    public static Integer findMin(List<Integer> list) {
        Integer min = Integer.MAX_VALUE;
        for (Integer i : list) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

    public static Integer findMax(List<Integer> list) {
        Integer max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(34);
        list.add(35);
        list.add(36);

        int sum = findMax(list) + findMin(list);
        for (int i = findMax(list); i > 1; i--) {
            if ((findMax(list) % i == 0) && (sum % i == 0)) {
                System.out.println("nwd= "+i);
                break;

            }

        }
        System.out.println("Min: " + findMin(list));
        System.out.println("Max: " + findMax(list));
        System.out.println("Sum: " + sum);


    }
}