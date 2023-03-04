package az.hackerrank.thirtyDayOfCode;

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, max = 0;
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                sum++;
            } else {
                sum = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }

        System.out.println(max);
    }
}
