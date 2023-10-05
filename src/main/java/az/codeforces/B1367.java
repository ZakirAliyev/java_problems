package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1367 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt(), tek = 0, cut = 0;

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                list.add(m);
                if (m % 2 != 0 && i % 2 != 0) {
                    tek++;
                } else if (m % 2 == 0 && i % 2 == 0) {
                    cut++;
                }
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if ((list.get(i) % 2 == 0 && i % 2 != 0) ||
                        (list.get(i) % 2 != 0 && i % 2 == 0)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(0);
            } else if (n % 2 != 0) {
                if ((count % 2 != 0 && tek > cut) ||
                        (count % 2 != 0 && tek < cut)) {
                    System.out.println(-1);
                } else {
                    System.out.println(count / 2);
                }
            } else {
                if ((count % 2 == 0 && tek > cut) ||
                        (count % 2 == 0 && tek < cut)) {
                    System.out.println(-1);
                } else {
                    System.out.println(count / 2);
                }
            }
        }
    }
}
