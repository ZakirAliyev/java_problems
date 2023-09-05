package az.codeforces.div4_871;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- != 0) {

            String a = sc.next();
            String b = "codeforces";
            int sum = 0;

            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
