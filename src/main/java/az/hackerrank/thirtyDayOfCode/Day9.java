package az.hackerrank.thirtyDayOfCode;

import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        System.out.println(factorial(n));
    }

    public static long factorial(long n) {

        long has = 1;
        for (int i = 2; i <= n; i++) {
            has *= i;
        }
        return has;
    }
}
