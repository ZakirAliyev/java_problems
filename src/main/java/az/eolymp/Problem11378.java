package az.eolymp;

import java.util.Scanner;

public class Problem11378 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        System.out.println(Math.min(Math.min(d / a, e / b), f / c));
    }
}
