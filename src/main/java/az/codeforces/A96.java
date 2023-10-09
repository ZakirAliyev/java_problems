package az.codeforces;

import java.util.Scanner;

public class A96 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        int sum1 = 0, sum = 0;
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                sum++;
                sum1 = 0;
            } else {
                sum1++;
                sum = 0;
            }
            if (sum == 7 || sum1 == 7) {
                System.out.println("YES");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("NO");
        }
    }
}
