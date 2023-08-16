package az.leetcode;

public class Problem21 {
    public String addBinary(String a, String b) {

        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        int z = c + d;
        return Integer.toBinaryString(z);
    }
}
