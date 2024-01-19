package az.leetcode;

public class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int j = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < n; i++) {
            arr[j] = nums[i];
            arr[j + 1] = nums[i + n];
            j += 2;
        }
        return arr;
    }
}