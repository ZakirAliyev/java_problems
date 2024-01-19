package az.leetcode;

public class Problem2011 {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String elem : operations) {
            if (elem.equals("--X") || elem.equals("X--")) {
                sum--;
            } else {
                sum++;
            }
        }
        return sum;
    }
}
