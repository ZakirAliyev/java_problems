package az.eolymp;

import java.util.Scanner;

public class Problem9002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long cem = 0;
        long a, b, n;

        n = scanner.nextLong();
        a = scanner.nextLong();
        b = scanner.nextLong();

        cem = (n / 2) * a + (n / 2) * b;

        if (n % 2 == 1) {
            cem += Math.max(a, b);
        }

        System.out.println(cem);
    }
}
