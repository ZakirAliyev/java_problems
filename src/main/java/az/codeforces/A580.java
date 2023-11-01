package az.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class A580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> a = new ArrayList<>();
        ArrayList<Long> b = new ArrayList<>();
        long s = 1;

        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }

        if (n == 1) {
            System.out.println(1);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (a.get(i) <= a.get(i + 1)) {
                    s++;
                } else {
                    s = 1;
                }
                b.add(s);
            }
            System.out.println(maxElement(b));
        }
    }

    static long maxElement(ArrayList<Long> arr) {
        long max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }
}
