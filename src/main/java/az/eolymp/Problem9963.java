package az.eolymp;

import java.util.Scanner;

public class Problem9963 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int e, f;
        e = c - a;
        f = d - b;

        double t = Math.sqrt(Math.pow(e, 2) + Math.pow(f, 2));
        System.out.printf("%.2f", t);
    }
}
