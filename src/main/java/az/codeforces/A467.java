package az.codeforces;

import java.util.Scanner;

public class A467 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(), sum = 0;

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b - a > 1) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
