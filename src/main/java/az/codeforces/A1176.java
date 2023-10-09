package az.codeforces;

import java.util.Scanner;

public class A1176 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong(), sum = 0;

            while (a > 1) {
                if (a % 5 == 0) {
                    a = 4 * a / 5;
                    sum++;
                } else if (a % 3 == 0) {
                    a = 2 * a / 3;
                    sum++;
                } else if (a % 2 == 0) {
                    a = a / 2;
                    sum++;
                } else {
                    sum = -1;
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
