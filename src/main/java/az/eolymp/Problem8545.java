package az.eolymp;

import java.util.Scanner;

public class Problem8545 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1 + " " + 2);
            System.out.println(3 + " " + 4);
        } else if (n == 3) {
            System.out.println(1 + " " + 2 + " " + 3);
            System.out.println(4 + " " + 5 + " " + 6);
            System.out.println(7 + " " + 8 + " " + 9);
        } else if (n > 3) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1) {
                        System.out.print(i * j);
                    } else if (String.valueOf(i * j).length() == 1) {
                        System.out.print("  " + i * j);
                    } else {
                        System.out.print(" " + i * j);
                    }
                }
                System.out.println();
            }
        }
    }
}
