package az.iktlab.lessons.lessonHacker;

import java.util.*;

public class birthdayCake {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        SortedSet<Integer> set = new TreeSet<>();

        for (int a : list) {
            set.add(a);
        }

        for (int a : set) {
            System.out.print(a + " ");
        }
    }
}
