package az.leetcode;

public class Problem1929 {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        System.arraycopy(nums, 0, arr, nums.length, nums.length);
        return arr;
    }
}
