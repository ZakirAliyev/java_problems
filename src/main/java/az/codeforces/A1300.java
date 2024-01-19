package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1300 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt(), sum = 0, cem = 0;
            for (int i = 0; i < n; i++) {
                int m = sc.nextInt();
                if (m == 0) {
                    m++;
                    sum++;
                }
                cem += m;
            }
            if (cem == 0) {
                System.out.println(sum + 1);
            } else {
                System.out.println(sum);
            }
        }
    }
}
