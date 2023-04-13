package az.etibarSeyidzade.week4_2;

import java.util.Scanner;

public class sudvetort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), sum = 0;

        for (int i = 0; i < n; i++) {

            double t = sc.nextDouble();
            if (t < 30) {
                sum++;
            }
        }
        if (sum * 200 % 900 != 0) {
            System.out.println(sum * 200 / 900 + 1 + " " + sum);
        } else {
            System.out.println(sum * 200 / 900 + " " + sum);
        }
    }
}
