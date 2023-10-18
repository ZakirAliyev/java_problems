package az.codeforces;

import java.util.Scanner;

public class B978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), sum = 0;
        String a = sc.next();

        for (int i = 0; i < n - 2; i++) {
            if (a.charAt(i) == 'x' &&
                    a.charAt(i + 1) == 'x' &&
                    a.charAt(i + 2) == 'x') {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
