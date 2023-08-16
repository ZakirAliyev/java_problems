package az.leetcode;

public class Problem14 {

    public String longestCommonPrefix(String[] strs) {

        int mn = Integer.MAX_VALUE;
        for (String elem : strs) {
            if (elem.length() < mn) {
                mn = elem.length();
            }
        }

        boolean flag = true;
        String px = "";
        for (int i = 0; i < mn; i++) {
            char ch = strs[0].charAt(i);
            for (String elem : strs) {
                if (elem.charAt(i) != ch) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                px += ch;
            } else {
                break;
            }
        }
        return px;
    }
}
