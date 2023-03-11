package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class enboyulreqeminsayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();

        int n = a.length();
        int max = a.charAt(0) - '0';

        for (int i = 1; i < n; i++) {
            int num = a.charAt(i) - '0';
            if (num > max) {
                max = num;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == max + '0') {
                sum++;
            }
        }

        System.out.println(sum);
    }
}

