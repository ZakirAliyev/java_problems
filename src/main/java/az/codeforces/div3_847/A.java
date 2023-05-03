package az.codeforces.div3_847;

import java.util.List;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            String a = sc.next();
            String pi = "3141592653589793238462643383279502884197169399375105" +
                    "8209749445923078164062862089986280348253421170679";
            int sum = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == pi.charAt(j)) {
                    sum++;
                } else {
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
