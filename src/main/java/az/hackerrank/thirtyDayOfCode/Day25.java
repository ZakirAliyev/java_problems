package az.hackerrank.thirtyDayOfCode;

import java.math.BigInteger;
import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            BigInteger bigInteger = sc.nextBigInteger();

            boolean flag = bigInteger.isProbablePrime(1);

            if (flag) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
