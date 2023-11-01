package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1857 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt(), sum = 0;
            boolean flag = false;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                list.add(m);
                sum += m;
            }
            for (int i = 0; i < n; i++) {
                if (((sum - list.get(i)) % 2 == 0 && list.get(i) % 2 == 0) ||
                        ((sum - list.get(i)) % 2 != 0 && list.get(i) % 2 != 0)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
