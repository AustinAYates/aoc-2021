package main.problems;

import main.problems.resources.Resources;

import java.util.ArrayList;

public class Day1 {
    public static void main(String[] args) {
        System.out.println(day1_1(Resources.day1_1));
        System.out.println(day1_2(Resources.day1_1));
    }

    public static int day1_1(String input) {
        int total = 0;

        String[] strArray = input.split("\n");
        ArrayList<Integer> arrayList = new ArrayList<>();

        //Wasn't sure how to handle this
//        Integer intstuff = Arrays.stream(strArray).mapToInt(str -> Integer.valueOf(str)).collect(Collections.list());

        for (String str : strArray) {
            arrayList.add(Integer.valueOf(str));
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > arrayList.get(i - 1)) {
                total++;
            }
        }
        return total;
    }

    public static int day1_2(String input) {
        int total = 0;

        String[] strArray = input.split("\n");
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (String str : strArray) {
            arrayList.add(Integer.valueOf(str));
        }

        for (int i = 3; i < arrayList.size(); i++) {
            if (arrayList.get(i) > arrayList.get(i - 3)) {
                total++;
            }
        }
        return total;
    }
}
