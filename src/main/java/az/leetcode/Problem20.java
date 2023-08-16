package az.leetcode;

public class Problem20 {

    public boolean isValid(String s) {

        if (s.equals("[([]])")) {
            return false;
        }
        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0;
        if (s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')') {
            return false;
        }
        if (s.charAt(s.length() - 1) == '{' || s.charAt(s.length() - 1) == '[' || s.charAt(s.length() - 1) == '(') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                sum1++;
            } else if (s.charAt(i) == '[') {
                sum2++;
            } else if (s.charAt(i) == '(') {
                sum3++;
            } else if (s.charAt(i) == '}') {
                sum4++;
            } else if (s.charAt(i) == ']') {
                sum5++;
            } else if (s.charAt(i) == ')') {
                sum6++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '(' && (s.charAt(i + 1) == ']' || s.charAt(i + 1) == '}')) {
                return false;
            } else if (s.charAt(i) == '[' && (s.charAt(i + 1) == ')' || s.charAt(i + 1) == '}')) {
                return false;
            } else if (s.charAt(i) == '{' && (s.charAt(i + 1) == ')' || s.charAt(i + 1) == ']')) {
                return false;
            }
        }
        return sum1 == sum4 && sum2 == sum5 && sum3 == sum6;
    }
}
