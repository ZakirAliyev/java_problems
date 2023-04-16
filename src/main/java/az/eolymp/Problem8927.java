package az.eolymp;

import java.util.Scanner;

public class Problem8927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int d = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                d = i;
                break;
            }
        }

        if (d > 0) {
            System.out.println(d);
        }
    }
}
