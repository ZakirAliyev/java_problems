package az.codeforces;

import java.util.Scanner;

public class A1840 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            String a = sc.next();

            int i = 0, j = 1;

            while (j < n) {
                if (a.charAt(i) == a.charAt(j)) {
                    System.out.print(a.charAt(i));
                    i = j + 1;
                    j += 2;
                } else {
                    j++;
                }
            }
            System.out.println();
        }
    }
}
