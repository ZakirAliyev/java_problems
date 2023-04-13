package az.eolymp;

import java.util.Scanner;

public class Problem5198 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long x = sc.nextInt();
        long n = sc.nextInt();
        long m = sc.nextInt();

        double result = Math.pow(x, n) % m;

        System.out.println((int) result);
    }
}
