package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class yoyo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double l = sc.nextLong();
        double k = sc.nextLong();
        int sum = 0;

        while (!(l / k <= 1)) {
            l /= k;
            sum++;
        }
        System.out.println(sum);
    }
}
