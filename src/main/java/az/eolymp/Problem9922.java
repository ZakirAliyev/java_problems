package az.eolymp;

import java.util.Scanner;

public class Problem9922 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();

        for (int i = 0; i < n - 1; i++) {
            System.out.print(a + "+");
        }
        System.out.print(a);
    }
}
