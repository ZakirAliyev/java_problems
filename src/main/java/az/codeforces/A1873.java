package az.codeforces;

import java.util.Scanner;

public class A1873 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            if (a.equals("bca") || a.equals("cab")) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
