package az.codeforces;

import java.util.Scanner;

public class A133 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'H' || s.charAt(i) == 'Q' || s.charAt(i) == '9' || s.charAt(i) == '+') {
                System.out.println("YES");
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("NO");
    }
}
