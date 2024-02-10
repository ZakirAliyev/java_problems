package az.codeChef;

import java.util.Scanner;

public class Problem13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }
}
