package az.hackerrank.lessonHacker.java;

import java.math.BigInteger;
import java.util.Scanner;

public class hacker17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger();

        boolean flag = n.isProbablePrime(1);
        if (flag)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}
