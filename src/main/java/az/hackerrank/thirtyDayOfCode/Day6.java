package az.hackerrank.thirtyDayOfCode;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- != 0) {

            String a = sc.next();

            for (int i = 0; i < a.length(); i += 2) {
                System.out.print(a.charAt(i));
            }
            System.out.print(" ");
            for (int i = 1; i < a.length(); i += 2) {
                System.out.print(a.charAt(i));
            }
            System.out.println();
        }
    }
}
