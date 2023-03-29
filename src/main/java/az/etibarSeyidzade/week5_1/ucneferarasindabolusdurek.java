package az.etibarSeyidzade.week5_1;

import java.math.BigInteger;
import java.util.Scanner;

public class ucneferarasindabolusdurek {

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int sum = 0;
//        String a = sc.nextLine();
//
//        for (int i = 0; i < a.length(); i++) {
//            sum += Integer.parseInt(String.valueOf(a.charAt(i)));
//        }
//
//        if (sum % 3 == 0) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BigInteger bigInteger = sc.nextBigInteger();
        BigInteger flag = bigInteger.remainder(BigInteger.valueOf(3));

        if (flag.equals(BigInteger.valueOf(0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
