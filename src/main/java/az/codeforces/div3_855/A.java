package az.codeforces.div3_855;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            String a = sc.next();
            a = a.toLowerCase();
            boolean flag = true;

            if (a.charAt(0)=='m' && a.contains("e") && a.contains("o") && a.charAt(a.length()-1)=='w' ) {
                for (int i = 1; i < n; i++) {
                    if ((a.charAt(i - 1) == 'm' && a.charAt(i) == 'e') ||
                            (a.charAt(i - 1) == 'm' && a.charAt(i) == 'm') ||
                            (a.charAt(i - 1) == 'e' && a.charAt(i) == 'e') ||
                            (a.charAt(i - 1) == 'e' && a.charAt(i) == 'o') ||
                            (a.charAt(i - 1) == 'o' && a.charAt(i) == 'o') ||
                            (a.charAt(i - 1) == 'o' && a.charAt(i) == 'w') ||
                            (a.charAt(i - 1) == 'w' && a.charAt(i) == 'w')) {
                    } else {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
