package az.iktlab.lessons.eolymp;

import java.util.Scanner;

public class Problem8991 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')) {
                System.out.print(a.charAt(i) + "" + a.charAt(i));
            } else
                System.out.print(a.charAt(i));
        }
    }
}
