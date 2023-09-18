package az.eolymp;

import java.util.Scanner;

public class Problem9930 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n % 24 != 0) {
            System.out.println(n / 24 + 1);
        } else {
            System.out.println(n / 24);
        }
    }
}
