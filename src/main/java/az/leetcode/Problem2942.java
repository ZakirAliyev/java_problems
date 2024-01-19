package az.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int z = 0;
        for (String elem : words) {
            boolean flag = false;
            for (int i = 0; i < elem.length(); i++) {
                if (elem.charAt(i) == x) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                list.add(z);
            }
            z++;
        }
        return list;
    }
}