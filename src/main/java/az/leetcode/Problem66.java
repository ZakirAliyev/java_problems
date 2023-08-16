package az.leetcode;

import java.math.BigInteger;

public class Problem66 {

    public int[] plusOne(int[] digits) {

        String a = "";
        for (int i = 0; i < digits.length; i++) {
            a += String.valueOf(digits[i]);
        }
        BigInteger bigInteger = new BigInteger(a);
        BigInteger b = bigInteger.add(BigInteger.ONE);
        String str = String.valueOf(b);
        int[] arr = new int[str.length()];
        for (int i = str.length() - 1; i >= 0; i--) {
            arr[i] = str.charAt(i) - 48;
        }
        return arr;
    }
}
