package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ozundenbasqahasili {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int has = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            list.add(t);
            if (t != 0) {
                if (sum != 1) {
                    has += 1;
                    sum++;
                }
                has *= t;
            }
        }

        boolean flag = list.contains(0);
        if (flag) {
            for (int i = 0; i < n; i++) {
                if (list.get(i) == 0) {
                    System.out.print(has + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(has / list.get(i) + " ");
            }
        }
    }
}
