package az.hackerrank.lessonHacker.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hacker29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list1.add(sc.nextInt());
            }
            list.add(list1);
        }

        int a = sc.nextInt();

        for (int j = 0; j < a; j++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                System.out.println(list.get(x-1).get(y-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
