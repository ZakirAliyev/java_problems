package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class onbireelametelameti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        int sum = 0, sum1 = 0;
        int n = a.length();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum1 += a.charAt(i) - '0';
            } else {
                sum += a.charAt(i) - '0';
            }
        }

        System.out.println(sum * sum1);
    }
}
