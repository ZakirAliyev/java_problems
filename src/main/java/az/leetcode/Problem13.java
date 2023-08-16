package az.leetcode;

public class Problem13 {

    public int romanToInt(String s) {

        int num = 0;
        int[] a = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'M') {
                a[i] = 1000;
            } else if (s.charAt(i) == 'D') {
                a[i] = 500;
            } else if (s.charAt(i) == 'C') {
                a[i] = 100;
            } else if (s.charAt(i) == 'L') {
                a[i] = 50;
            } else if (s.charAt(i) == 'X') {
                a[i] = 10;
            } else if (s.charAt(i) == 'V') {
                a[i] = 5;
            } else if (s.charAt(i) == 'I') {
                a[i] = 1;
            }
        }

        for (int i = a.length - 1; i > 0; i--) {
            if (a[i - 1] >= a[i]) {
                num += a[i - 1];
            } else {
                num -= a[i - 1];
            }
        }

        return num + a[a.length - 1];
    }
}
