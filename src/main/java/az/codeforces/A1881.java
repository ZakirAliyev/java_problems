package az.codeforces;

import java.util.Scanner;

public class A1881 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt(), sum = 0;
            int b = sc.nextInt();
            String c = sc.next();
            String d = sc.next();
            if (c.contains(d)) {
                System.out.println(0);
            } else {
                boolean flag = false;
                while (c.length() < 26) {
                    c = c + c;
                    sum++;
                    if (c.contains(d)) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println(-1);
                } else {
                    System.out.println(sum);
                }
            }
        }
    }
}
