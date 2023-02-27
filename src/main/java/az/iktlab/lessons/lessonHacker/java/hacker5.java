package az.iktlab.lessons.lessonHacker.java;

import java.util.Scanner;

public class hacker5 {

    public static void main(String[] args) {

        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String a = sc.next();
            String b = sc.next();
            System.out.printf(a + "");
            c = 15 - a.length();
            for (int j = 0; j < c; j++) {
                System.out.printf(" ");
            }
            if (b.length() == 1) System.out.printf("00" + b + "\n");
            else if (b.length() == 2) System.out.printf("0" + b + "\n");
            else System.out.printf(b + "\n");
        }
        System.out.println("================================");
    }
}
