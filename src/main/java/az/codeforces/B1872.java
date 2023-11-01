package az.codeforces;

import java.math.BigInteger;
import java.util.*;

public class B1872 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            String s = "-1";
            int a = sc.nextInt();
            int b = sc.nextInt();

            for (int j = a; j <= b; j++) {
                BigInteger bigInteger = new BigInteger(String.valueOf(j));
                if (bigInteger.isProbablePrime(1) && j != 2) {
                    s = "YES";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
