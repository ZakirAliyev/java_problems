package az.eolymp;

import java.util.Scanner;

public class Problem8926 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long a = 1, sum = 0;
        long n = sc.nextLong();
        while (n != 0) {
            long t = n % 10;
            if (t % 2 == 0) {
                t++;
            } else {
                t--;
            }
            sum += a * t;
            n /= 10;
            a *= 10;
        }
        System.out.println(sum);
    }
}
