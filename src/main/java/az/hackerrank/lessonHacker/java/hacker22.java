package az.hackerrank.lessonHacker.java;

import java.util.Scanner;

public class hacker22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int n = sc.nextInt();

        getSmallestAndLargest(a, n);
    }

    public static void getSmallestAndLargest(String a, int n) {

        java.util.List<String> list = new java.util.ArrayList<>();

        for (int i = 0; i < a.length() - n + 1; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = 0; j < n; j++) {
                str.append(a.charAt(i + j));
            }
            list.add(String.valueOf(str));
        }

        java.util.Collections.sort(list);

    }
}