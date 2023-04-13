package az.eolymp;

import java.util.Scanner;

public class Problem8222 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(m - n + 1);

        for (int i = n; i <= m; i++) {
            System.out.print(a.charAt(i - 1));
        }
    }
}
