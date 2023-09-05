package az.eolymp.adaDay4;

import java.util.*;

public class L {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }

        TreeSet<Long> s = new TreeSet<>();
        s.add(0L);

        for (int i = 0; i < k; i++) {
            long x = s.first();
            s.remove(x);

            for (int j = 0; j < n; j++) {
                s.add(x + m[j]);
            }
        }

        System.out.println(s.first());
    }
}
