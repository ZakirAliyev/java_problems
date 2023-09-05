package az.codeforces.div4_886;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b >= 10 || a + c >= 10 || b + c >= 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
