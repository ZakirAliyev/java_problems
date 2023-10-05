package az.eolymp;

import java.util.Scanner;

public class Problem138 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), sum = 0;

        while (n > 0) {
            if (n >= 500) {
                n -= 500;
            } else if (n >= 200) {
                n -= 200;
            } else if (n >= 100) {
                n -= 100;
            } else if (n >= 50) {
                n -= 50;
            } else if (n >= 20) {
                n -= 20;
            } else if (n >= 10) {
                n -= 10;
            }
            sum++;
        }
        System.out.println(sum);
    }
}
