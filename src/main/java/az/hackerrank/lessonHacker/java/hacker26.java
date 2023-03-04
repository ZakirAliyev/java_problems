package az.hackerrank.lessonHacker.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class hacker26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        printArray();
    }

    public static void printArray() {
        List<Object> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add("Hello");
        list.add("World");

        list.forEach(System.out::println);
    }
}
