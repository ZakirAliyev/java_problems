package az.hackerrank.problemSolving;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), plus = 0, minus = 0, stan = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t < 0) {
                minus++;
            } else if (t == 0) {
                stan++;
            } else {
                plus++;
            }
        }

        System.out.printf("%.6f\n", (double) plus / n);
        System.out.printf("%.6f\n", (double) minus / n);
        System.out.printf("%.6f", (double) stan / n);
    }
}
