package az.leetcode;

import java.util.Scanner;

public class Problem9 {

    public static boolean isPalindrome(int x) {

        boolean flag = false;

        String a = String.valueOf(x), b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b)) {
            flag = true;
        }
        return flag;
    }
}
