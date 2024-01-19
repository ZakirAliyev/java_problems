package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt() % k);
            }

            int sum = k;
            for (int i = 0; i < n; i++) {
                sum = Math.min(sum, (k - list.get(i)) % k);
            }

            if (k == 4) {
                int mn1 = k;
                int mn2 = k;

                for (int i = 0; i < n; i++) {
                    int x;
                    if (list.get(i) <= 2) {
                        x = 2 - list.get(i);
                    } else {
                        x = 3;
                    }
                    if (mn1 > x) {
                        mn2 = mn1;
                        mn1 = x;
                    } else {
                        mn2 = Math.min(mn2, x);
                    }
                }
                sum = Math.min(sum, mn1 + mn2);
            }

            System.out.println(sum);
        }
    }
}
