package az.eolymp;

import java.util.Scanner;

public class Problem9936 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        double count = Math.pow(10, n - 1);
        double count1 = Math.pow(10, n);
        double sum = m - count;

        if (count1 < m) {
            System.out.println((int) Math.pow(10, n) - (int) Math.pow(10, n - 1));
        } else if (sum < 0) {
            System.out.println(0);
        } else {
            System.out.println((int) sum);
        }
    }
}
