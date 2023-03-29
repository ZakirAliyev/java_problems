package az.etibarSeyidzade.week4_2;

import java.util.*;

public class ikiminimum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (!list.contains(t)) {
                list.add(t);
            }
        }

        Collections.sort(list);

        System.out.println(list.get(0) + " " + list.get(1));
    }
}
