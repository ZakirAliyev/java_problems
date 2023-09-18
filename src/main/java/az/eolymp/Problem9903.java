package az.eolymp;

import java.util.Scanner;

public class Problem9903 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n % 2 != 0) {
            System.out.println(n / 2 + 1);
        } else {
            System.out.println(n / 2);
        }
    }
}