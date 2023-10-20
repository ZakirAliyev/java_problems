package az.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B1759 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            List<Integer> list = new ArrayList<>();
            boolean flag = false;
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int r = sc.nextInt();
                list.add(r);
            }
            int z = 1;
            while (m >= 0) {
                if (!list.contains(z)) {
                    m -= z;
                    list.add(z);
                }
                z++;
                if (m == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag && Collections.max(list) == list.size()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
