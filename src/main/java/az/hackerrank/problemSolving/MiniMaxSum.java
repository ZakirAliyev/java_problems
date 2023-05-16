package az.hackerrank.problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLong());
        }

        long sum = list.stream()
                .mapToLong(Long::longValue)
                .sum();

        List<Long> list1 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list1.add(sum - list.get(i));
        }

        System.out.print(Collections.min(list1) + " ");
        System.out.print(Collections.max(list1));
    }
}
