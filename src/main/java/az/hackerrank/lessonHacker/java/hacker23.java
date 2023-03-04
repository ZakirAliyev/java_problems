package az.hackerrank.lessonHacker.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hacker23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y, z;
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            String a = sc.next();
            if (a.equals("Insert")) {
                x = sc.nextInt();
                y = sc.nextInt();
                list.add(x, y);
            } else if (a.equals("Delete")) {
                z = sc.nextInt();
                list.remove(z);
            }
        }

        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}
