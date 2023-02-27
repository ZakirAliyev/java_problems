package az.iktlab.lessons.lessonHacker.java;

import java.util.Scanner;

public class hacker14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i < n; i++) {
            System.out.print(a.charAt(i));
        }
    }
}
