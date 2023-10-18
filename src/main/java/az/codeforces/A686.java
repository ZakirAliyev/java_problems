package az.codeforces;

import java.util.Scanner;

public class A686 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long t = sc.nextLong(), sum = 0;

        for (long i = 0; i < n; i++) {
            String a = sc.next();
            long b = sc.nextLong();
            if (a.equals("+")) {
                t += b;
            } else if (a.equals("-") && t - b >= 0) {
                t -= b;
            } else {
                sum++;
            }
        }
        System.out.println(t + " " + sum);
    }
}
