package az.leetcode;

public class Problem70 {

    public boolean isPalindrome(String s) {

        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) > 96 && s.charAt(i) < 123)
                    || (s.charAt(i) > 47) && s.charAt(i) < 58) {
                a.append(s.charAt(i));
            }
        }
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        return a.toString().contentEquals(b);
    }
}
