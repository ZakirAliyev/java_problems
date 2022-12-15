package az.iktlab.lessons.lessonHacker;

import java.util.Scanner;

public class hacker13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int h = sc.nextInt();

        if (b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(b * h);
        }
    }
}
