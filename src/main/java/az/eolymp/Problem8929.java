package az.eolymp;

import java.math.BigInteger;
import java.util.Scanner;

public class Problem8929 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger bigInteger = sc.nextBigInteger();

        System.out.println(bigInteger.isProbablePrime(1) ? 1 : 0);
    }
}
