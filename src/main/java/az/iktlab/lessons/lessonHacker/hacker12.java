package az.iktlab.lessons.lessonHacker;

import org.jetbrains.annotations.Nls;

import java.util.Scanner;

public class hacker12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());

        if (a.compareTo(b) <= 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        String s1 = a.substring(0, 1).toUpperCase();
        String s2 = a.substring(1);
        String res = a.substring(0, 1).toUpperCase() + a.substring(1);

        String s3 = b.substring(0, 1).toUpperCase();
        String s4 = b.substring(1);
        String res1 = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(res + " " + res1);
    }
}
