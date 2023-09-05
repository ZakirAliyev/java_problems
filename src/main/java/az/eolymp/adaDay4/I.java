package az.eolymp.adaDay4;

import java.util.Scanner;

public class I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (b > c) {
            long temp = b;
            b = c;
            c = temp;
        }
        if (b + c <= a) {
            System.out.println(b + c);
        } else {
            if ((int) b / 2 + c <= a) {
                System.out.println((int) b / 2 + c);
            } else if (c < a && b < a) {
                System.out.println(Math.max(a, b));
            }
        }


    }
}