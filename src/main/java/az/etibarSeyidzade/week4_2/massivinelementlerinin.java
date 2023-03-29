package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class massivinelementlerinin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> a = new ArrayList<>();
        long has = 1, has1 = 1;
        for (int i = 0; i < n; i++) {
            a.add(sc.nextLong());
        }
        for (int i = 0; i < n; i++) {
            if (a.get(i) != 0) {
                has *= a.get(i);
            }
            has1 *= a.get(i);
        }
        long p = has1;
        for (int i = 0; i < n; i++) {
            if (a.get(i) == 0) {
                System.out.print(has + " ");
            } else {
                has1 = has1 / a.get(i);
                System.out.print(has1 + " ");
            }
            has1 = p;
        }
    }
}

