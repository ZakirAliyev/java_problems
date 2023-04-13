package az.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem1952 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = Collections.max(list);
        int min = Collections.min(list);

        for (int elem : list) {
            if (elem == max) {
                System.out.print(min + " ");
            } else {
                System.out.print(elem + " ");
            }
        }
    }
}
