package az.iktlab.lessons.eolymp;

import java.util.*;

public class Problem11340 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = 0;
        for (int i = 0; i < n; i++) {

            List<Integer> list1 = new ArrayList<>();

            for (int j = i; j < n; j++) {
                if (!list1.contains(list.get(j))) {
                    list1.add(list.get(j));
                } else {
                    break;
                }
            }
            if (list1.size() > max) {
                max = list1.size();
            }
        }
        System.out.println(max);
    }
}
