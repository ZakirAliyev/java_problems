package az.codeforces;

import java.util.Scanner;

public class A112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        boolean flag = true;


        if (Integer.parseInt(a) % 4 == 0 ||
                Integer.parseInt(a) % 7 == 0 ||
                Integer.parseInt(a) % 47 == 0) {
            System.out.println("YES");
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != '4' && a.charAt(i) != '7') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
