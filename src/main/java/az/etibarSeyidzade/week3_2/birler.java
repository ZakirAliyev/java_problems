package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class birler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int sum2 = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                sum2++;
            }
            n /= 2;
        }

        System.out.println(sum2);
    }
}
