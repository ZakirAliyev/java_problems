package az.codeforces;

import java.util.Scanner;

public class G1873 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0, sum1 = 0;
            StringBuilder a = new StringBuilder(sc.next());
            StringBuilder b = new StringBuilder(a);
            for (int j = 1; j < a.length(); j++) {
                if (a.charAt(j - 1) == 'A' && a.charAt(j) == 'B') {
                    sum++;
                    a.setCharAt(j - 1, 'B');
                    a.setCharAt(j, 'C');
                } else if (a.charAt(j - 1) == 'B' && a.charAt(j) == 'A') {
                    sum++;
                    a.setCharAt(j - 1, 'C');
                    a.setCharAt(j, 'B');
                }
            }
            for (int j = b.length() - 1; j >= 1; j--) {
                if (b.charAt(j - 1) == 'A' && b.charAt(j) == 'B') {
                    sum1++;
                    b.setCharAt(j - 1, 'B');
                    b.setCharAt(j, 'C');
                } else if (b.charAt(j - 1) == 'B' && b.charAt(j) == 'A') {
                    sum1++;
                    b.setCharAt(j - 1, 'C');
                    b.setCharAt(j, 'B');
                }
            }
            System.out.println(Math.max(sum, sum1));
        }
    }
}
