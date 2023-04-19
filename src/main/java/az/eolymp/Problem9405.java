package az.eolymp;

import java.util.Scanner;

public class Problem9405 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        // n = a + b + c
        // m = a + c
        // k = a + b
        // sout(a, b, c)

        System.out.print((n-((n - m) + (n-k))) + " ");
        System.out.print((n - m) + " ");
        System.out.print(n - k);
    }
}
