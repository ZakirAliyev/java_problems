package az.codeforces;

import java.util.Scanner;

public class A230 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (s > a) {
                s += b;
            }
        }
        if (s > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


