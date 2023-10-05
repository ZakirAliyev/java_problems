package az.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem8236 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        while (n-- != 0) {
            int m = sc.nextInt();
            if (m % 2 != 0) {
                list1.add(m);
            } else {
                list2.add(m);
            }
        }

        Collections.sort(list1);
        list2.sort(Collections.reverseOrder());

        for (int elem : list1) {
            System.out.print(elem + " ");
        }
        for (int elem : list2) {
            System.out.print(elem + " ");
        }
    }
}
