package az.codeforces;

import java.util.Scanner;

public class A746 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt(), sum = 0;

        int mn = Math.min(Math.min(a, b / 2), c / 4);
        sum += 7 * mn;
        System.out.println(sum);
    }
}
