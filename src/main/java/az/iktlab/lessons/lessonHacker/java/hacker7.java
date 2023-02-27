package az.iktlab.lessons.lessonHacker.java;

import java.util.Scanner;

public class hacker7 {

    public static void main(String[] args) {

        int p = 0;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            p = a + b;
            System.out.printf(p + " ");
            for (int j = 1; j < n; j++) {
                p += Math.pow(2, j) * b;
                System.out.printf(p + " ");
            }
            System.out.println();
            p = 0;
        }
    }
}
