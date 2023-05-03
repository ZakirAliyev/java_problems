package az.codeforces.div3_839;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s = sc.next();
            System.out.println((int) s.charAt(0) + (int) s.charAt(2) - 96);
        }
    }
}
