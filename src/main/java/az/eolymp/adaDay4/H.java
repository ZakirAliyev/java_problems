package az.eolymp.adaDay4;

import java.util.Scanner;

public class H {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 == 1) {
            System.out.print("7");
            a -= 3;
        }
        for (int i = 0; i < a/2; i++) {
            System.out.print(1);
        }
    }
}
