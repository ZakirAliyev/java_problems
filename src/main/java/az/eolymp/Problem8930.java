package az.eolymp;

import java.util.Scanner;

public class Problem8930 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long i = 2;

        while (n != 1) {
            if (n % i == 0) {
                System.out.println(i);
                n /= i;
            } else {
                i++;
            }
        }
    }
}