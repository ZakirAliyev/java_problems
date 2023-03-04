package az.hackerrank.thirtyDayOfCode;

import java.util.Scanner;

public class Day5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf(n + " x " + i + " = %s",i*n);
            System.out.println();
        }
    }
}
