package az.leetcode;

public class Problem69 {
    public int mySqrt(int x) {
        long i = 1;
        while (i * i <= (long) x) {
            i++;
        }
        return (int) i - 1;
    }
}