package az.codeforces.div3_834;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            String a = sc.next();
            boolean flag = true;
            if (a.equals("YES")) {
                System.out.println("NO");
            } else {
                a = a.toLowerCase();
                for (int i = 1; i < a.length(); i++) {
                    if ((a.charAt(i - 1) == 'y' && a.charAt(i) == 'e') ||
                            (a.charAt(i - 1) == 'e' && a.charAt(i) == 's') ||
                            (a.charAt(i - 1) == 's' && a.charAt(i) == 'y')) {
                    } else {
                        flag = false;
                        break;
                    }
                }
                if (flag && (a.contains("y") || a.contains("e") || a.contains("s"))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

