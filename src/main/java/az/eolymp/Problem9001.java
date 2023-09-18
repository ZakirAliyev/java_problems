package az.eolymp;

import java.util.Scanner;

public class Problem9001 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(1);
        } else if (a < 0 && b < 0 && (Math.abs(a + b)) % 2 == 0) {
            System.out.println(-1);
        } else if (a < 0 && b < 0 && (Math.abs(a + b)) % 2 != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
