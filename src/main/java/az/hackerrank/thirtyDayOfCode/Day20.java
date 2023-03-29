package az.hackerrank.thirtyDayOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int numberOfSwaps = 0;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1; j++) {

                if (list.get(j) > list.get(i + 1)) {
                    int c = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, c);
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.printf("Array is sorted in %s swaps.", numberOfSwaps);
        System.out.println();
        Collections.sort(list);
        System.out.println("First Element: " + Collections.min(list));
        System.out.println("Last Element: " + Collections.max(list));
    }
}
