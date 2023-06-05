package az.ypb2.murekkebEdedler;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (float) 1 / ((long) i * (i + 1));
        }

        System.out.printf("%.6f", sum);
    }
}
