package az.codeforces;

import java.util.Scanner;

public class A1754 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt(), sum = 0;
            String a = sc.next();

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'Q') {
                    sum++;
                }
                if (a.charAt(i) == 'A') {
                    sum--;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            if (sum == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
