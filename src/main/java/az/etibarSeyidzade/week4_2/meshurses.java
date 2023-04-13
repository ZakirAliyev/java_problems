package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class meshurses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            int max = Integer.MIN_VALUE, idx = Integer.MIN_VALUE;
            int n = sc.nextInt(), sum = 0, sum1 = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {

                int a = sc.nextInt();
                sum += a;
                list.add(a);

                if (a > max) {
                    max = a;
                    idx = i;
                }
            }

            for (Integer integer : list) {
                if (integer == max) {
                    sum1++;
                }
            }

            if (sum1 > 1) {
                System.out.println("no winner");
            } else if (max > sum / 2) {
                System.out.println("majority winner " + (idx + 1));
            } else {
                System.out.println("minority winner " + (idx + 1));
            }
        }
    }
}