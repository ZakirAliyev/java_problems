package az.leetcode;

public class Problem67 {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1, digit2;
            if (i >= 0) {
                digit1 = a.charAt(i--) - '0';
            } else {
                digit1 = 0;
            }

            if (j >= 0) {
                digit2 = b.charAt(j--) - '0';
            } else {
                digit2 = 0;
            }

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }
}
