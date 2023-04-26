package az.codeforces.div3_863;

import java.util.*;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            String b = sc.next();
            String c = sc.next();
            boolean flag = true;
            if (b.equals("0")) {
                System.out.println(c + "0");
            } else {
                for (int i = 0; i < a; i++) {
                    if (b.charAt(0) > c.charAt(i)) {
                        for (int j = 0; j < i; j++) {
                            System.out.print(c.charAt(j));
                        }
                        System.out.print(b.charAt(0));
                        for (int j = i; j < a; j++) {
                            System.out.print(c.charAt(j));
                        }
                        System.out.println();
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.println(c + b.charAt(0));
                }
            }
        }
    }
}
