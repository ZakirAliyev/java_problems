package az.hackerrank.tenDayOfStatistics;

import java.util.*;

public class Day0_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double t = sc.nextDouble(), sum = 0;
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            double m = sc.nextInt();
            list.add(m);
            sum += m;
        }
        Collections.sort(list);
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int sum1 = 0;
            for (int j = 0; j < t; j++) {
                if (list.get(i).equals(list.get(j))) {
                    sum1++;
                }
            }
            if (sum1 > 1) {
                list1.add(list1.get(i));
            }
        }

        System.out.println(sum / t);
        if (t % 2 == 0) {
            System.out.println((list.get((int) (t / 2)) +
                    list.get((int) (t / 2 - 1))) / 2);
        } else {
            System.out.println(list.get((int) (t / 2 + 1)));
        }
    }
}
