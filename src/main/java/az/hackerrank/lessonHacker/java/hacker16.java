package az.hackerrank.lessonHacker.java;

import java.util.Scanner;

public class hacker16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
