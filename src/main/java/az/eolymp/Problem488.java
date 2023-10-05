package az.eolymp;

import java.util.Scanner;

public class Problem488 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        int n = sc.nextInt(), sum = 1, u = 1;

        for (int i = 1; i <= n; i++) {
            if (flag) {
                for (int j = n * u + 1 - n; j < n * u + 1; j++) {
                    System.out.print(j + " ");
                }
            } else {
                for (int j = n * u; j > n * u - n; j--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
            flag = !flag;
            sum += n * u - n;
            u++;
        }
    }
}
