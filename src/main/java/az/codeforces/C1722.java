package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1722 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    list.add(sc.next());
                }
            }
            List<Integer> list1 = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < 3 * n; i++) {
                sum = 0;
                for (int j = 0; j < n * 3; j++) {
                    if (list.get(i).equals(list.get(j))) {
                        sum++;
                    }
                }
                list1.add(sum);
            }
            int k = 0;
            for (int i = 1; i < 4; i++) {
                int sum2 = 0;
                for (int j = k; j < n * i; j++) {
                    if (list1.get(j) == 2) {
                        sum2 += 1;
                    } else if (list1.get(j) == 1) {
                        sum2 += 3;
                    }
                }
                k += n;
                System.out.print(sum2 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
