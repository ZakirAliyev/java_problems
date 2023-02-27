package az.iktlab.lessons.lessonHacker.java;

import java.util.Scanner;

public class hacker24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String a = sc.next();

            if (a.matches("^[a-zA-Z][A-Za-z_0-9]{7,29}$")) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }
    }
}
