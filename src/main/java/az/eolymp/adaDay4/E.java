package az.eolymp.adaDay4;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            System.out.println(sc.nextInt() * sc.nextInt() % 2 == 0 ? "YES" : "NO");
        }
    }
}