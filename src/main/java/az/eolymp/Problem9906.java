package az.eolymp;

import java.util.Scanner;

public class Problem9906 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a > b) {
            long temp = a;
            a = b;
            b = temp;
        }

        if (a < 0 && b > 0) {
            System.out.println(Math.abs(a) + Math.abs(b) + 1);
        } else if (a == 0 && b > 0) {
            System.out.println(b + 1);
        } else {
            System.out.println(Math.abs(a + Math.abs(b) - 1));
        }
    }
}
