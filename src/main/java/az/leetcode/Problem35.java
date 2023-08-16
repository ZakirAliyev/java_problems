package az.leetcode;

public class Problem35 {
    public int searchInsert(int[] nums, int target) {

        int t = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                t = i;
                break;
            }
        }
        return t;
    }
}