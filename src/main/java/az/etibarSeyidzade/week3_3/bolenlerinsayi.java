package az.etibarSeyidzade.week3_3;

import java.util.Scanner;

public class bolenlerinsayi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
