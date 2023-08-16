package az.leetcode;

public class Problem28 {
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";
        boolean flag = true;
        for (int i = 0; i < haystack.length(); i += needle.length()) {
            int h = i;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(h) != needle.charAt(j)) {
                    flag = false;
                }
                h++;
            }
        }
        System.out.println(flag);
    }
}
