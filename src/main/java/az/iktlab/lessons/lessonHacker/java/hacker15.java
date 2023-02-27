package az.iktlab.lessons.lessonHacker.java;

import java.util.Arrays;
import java.util.Scanner;

public class hacker15 {

    public static StringBuilder getSmallestAndLargest(String a, int n) {

        StringBuilder str = new StringBuilder();
        for (int i = a.length() - n; i < a.length(); i++) {
            str.append(a.charAt(i));
        }
        str.append("\n");
        for (int i = 0; i < n; i++) {
            str.append(a.charAt(i));
        }
        return str;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int n = sc.nextInt();

        Arrays.sort(a.toCharArray());

        System.out.println(getSmallestAndLargest(a, n));
    }
}
