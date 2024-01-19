package az.leetcode;

public class Problem1108 {
    public static String defangIPaddr(String address) {
        String a = "";
        for (int i = 1; i < address.length(); i++) {
            if (address.charAt(i - 1) != '.') {
                a += address.charAt(i - 1);
            } else {
                a += "[.]";
            }
        }
        a += address.charAt(address.length() - 1);
        return a;
    }
}