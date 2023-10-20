package az.codeforces;

import java.util.Scanner;

public class A1680 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (Math.max(a, c) <= Math.min(b, d)) {
                System.out.println(Math.max(a, c));
            } else {
                System.out.println(a + c);
            }
        }
    }
}
