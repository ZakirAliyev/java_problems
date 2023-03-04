package az.hackerrank.lessonHacker.java;

import java.util.Scanner;

public class hacker21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.trim();
        String[] strings = s.split("[ !,?._'@]+");
        if (strings.length == 0 || s.equals(""))
            System.out.println(0);
        else {
            System.out.println(strings.length);
            for (String a : strings) {
                System.out.println(a);
            }
        }
    }
}
