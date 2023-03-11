package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class ededinenboyukreqemi {
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

        System.out.println(max);
    }
}

