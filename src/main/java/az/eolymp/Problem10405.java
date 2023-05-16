package az.eolymp;

import java.util.Scanner;

public class Problem10405 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }

        System.out.println(Math.min(
                b - a,
                Math.min(Math.abs(c - a), Math.abs(c - b))
                        + Math.min(Math.abs(d - a), Math.abs(d - b))
        ));
    }
}
