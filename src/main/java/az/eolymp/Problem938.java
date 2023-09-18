package az.eolymp;

import java.util.Scanner;

public class Problem938 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double e = sc.nextDouble();

        System.out.printf("%.2f", (d + b) * e);
        System.out.print(" ");
        System.out.printf("%.2f", (c + a) * e);
    }
}
