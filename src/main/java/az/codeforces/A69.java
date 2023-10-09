package az.codeforces;

import java.util.Scanner;

public class A69 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum1 = 0, sum2 = 0, sum3 = 0;

        while (n-- != 0) {
            sum1 += sc.nextInt();
            sum2 += sc.nextInt();
            sum3 += sc.nextInt();
        }
        if (sum1 == sum2 && sum2 == sum3 && sum3 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
