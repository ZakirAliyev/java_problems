package az.eolymp;

import java.util.Scanner;

public class Problem932 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        double h = (-n + Math.sqrt(Math.pow(n, 2) + 8 * s)) / 2;

        System.out.printf("%.2f", h);
    }
}