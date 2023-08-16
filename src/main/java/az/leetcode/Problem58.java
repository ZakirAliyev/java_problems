package az.leetcode;

public class Problem58 {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        boolean flag = false;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                k = i;
                flag = true;
            }
        }
        if (!flag) {
            return s.length();
        }
        return s.length() - k - 1;
    }
}
