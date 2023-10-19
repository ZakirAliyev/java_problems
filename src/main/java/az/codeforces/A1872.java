package az.codeforces;

import java.util.Scanner;

public class A1872 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            double c = Math.max(a, b) - (double) (a + b) / 2;

            if (c % n != 0) {
                System.out.println((int)(c / n + 1));
            } else {
                System.out.println((int)(c / n));
            }
        }
    }
}
