package main.problems;

import main.problems.resources.Resources;

public class Day2 extends Resources {
    public static void main(String[] args) {
        System.out.println(day2_1(inputArr(day2_1)));
        System.out.println(day2_2(inputArr(day2_1)));
    }

    public static int day2_1(String[] strArray) {
        int fwd = 0;
        int depth = 0;

        for (String str : strArray) {
            int num = Integer.parseInt(str.substring(str.length() - 1));
            switch (str.substring(0, 1)) {
                case "f" -> fwd += num;
                case "d" -> depth += num;
                case "u" -> depth -= num;
            }
        }

        System.out.println("Fwd: " + fwd + ". Depth: " + depth);
        return fwd * depth;
    }

    public static int day2_2(String[] strArray) {
        int fwd = 0;
        int depth = 0;
        int aim = 0;

        for (String str : strArray) {
            int num = Integer.parseInt(str.substring(str.length() - 1));
            switch (str.substring(0, 1)) {
                case "f" -> {
                    fwd += num;
                    depth += aim * num;
                }
                case "d" -> aim += num;
                case "u" -> aim -= num;
            }
        }

        System.out.println("Fwd: " + fwd + ". Depth: " + depth + ". Aim: " + aim);
        return fwd * depth;
    }
}