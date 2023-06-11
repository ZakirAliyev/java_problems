package az.etibarSeyidzade.exam.arraySort;

import java.util.Scanner;

public class menfiElemenetler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble(), count = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            double t = sc.nextDouble();
            if (t < 0) {
                count++;
                sum += t;
            }
        }

        System.out.print((int) count + " " + String.format("%.2f", sum));
    }
}