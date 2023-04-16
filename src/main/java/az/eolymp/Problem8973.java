package az.eolymp;

import java.util.*;

public class Problem8973 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.reverse(list);

        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }
        }

        Collections.reverse(list1);

        for (int elem : list1) {
            System.out.print(elem + " ");
        }
    }
}
