package az.eolymp;

import java.util.Scanner;

public class Problem7337 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((Math.max(Math.max(a, b), c)) +
                (Math.min(Math.min(a, b), c)));
    }
}
