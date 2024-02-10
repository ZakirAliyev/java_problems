package az.codeChef;

import java.util.Scanner;

public class Problem15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
