package az.codeforces;

import java.util.Scanner;

public class C1883 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt() % k;
            }

            int ans = k;
            for (int i = 1; i <= n; i++) {
                ans = Math.min(ans, (k - a[i]) % k);
            }

            if (k == 4) {
                int mn1 = k;
                int mn2 = k;

                for (int i = 1; i <= n; i++) {
                    int x;
                    if (a[i] <= 2) {
                        x = 2 - a[i];
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
                ans = Math.min(ans, mn1 + mn2);
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
