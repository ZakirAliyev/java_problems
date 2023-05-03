package az.eolymp;

import java.util.*;

public class Problem1953 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < t; i++) {
            map.put(i + 1, sc.nextInt());
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));

        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.print(entry.getKey() + " ");
        }
    }
}
