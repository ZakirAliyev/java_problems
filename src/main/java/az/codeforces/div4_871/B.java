package az.codeforces.div4_871;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int sum = 0, max = 0;
            for (int elem : list) {
                if (elem == 0) {
                    sum++;
                    if (sum > max) {
                        max = sum;
                    }
                } else {
                    sum = 0;
                }
            }
            System.out.println(max);
        }
    }
}
