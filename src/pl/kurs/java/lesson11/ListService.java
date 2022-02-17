package pl.kurs.java.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListService {
    public List<Integer> get5HighestNums(List<Integer> integers) {
        List<Integer> collect = integers.stream().sorted().collect(Collectors.toList());
        List<Integer> integers1 = new ArrayList<>();
        if (collect.size() >= 5) {
            for (int i = collect.size() - 1; i > collect.size() - 6; i--) {
                integers1.add(collect.get(i));
            }
        }
        return integers1;
    }
}
