package az.codeforces;

import java.util.Scanner;

public class A1368 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt(),sum = 0;

            while (a <= n && b <= n) {
                int c = Math.max(a, b);
                a = a + b;
                b = c;
                sum++;
            }

            System.out.println(sum);
        }
    }
}
