package az.codeforces;

import java.util.Scanner;

public class A1858 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            boolean flag = c % 2 == 0;
//            Bruteforce way
//            while (a > 0 && b > 0) {
//                if (flag) {
//                    a--;
//                    flag = false;
//                } else {
//                    b--;
//                    flag = true;
//                }
//            }
            if (flag) {
                if (a>b) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
            } else {
                if (a<b) {
                    System.out.println("Second");
                } else {
                    System.out.println("First");
                }
            }
        }
    }
}
