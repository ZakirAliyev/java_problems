package az.leetcode;

public class Problem136 {
    public int singleNumber(int[] nums) {

        for (int num : nums) {
            int sum = 0;
            for (int i : nums) {
                if (num == i) {
                    sum++;
                }
            }
            if (sum == 1) {
                return num;
            }
        }
        return 0;
    }
}