package az.codeforces;

import java.util.Scanner;

public class A731 {

    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char c = 'a';
        int abs1 = Math.abs(c - a.charAt(0));
        int l = Math.min(abs1, 26 - abs1);
        for (int i = 0; i < a.length() - 1; i++) {
            int abs = Math.abs(a.charAt(i) - a.charAt(i + 1));
            k += Math.min(abs, 26 - abs);
        }
        System.out.println(k + l);
    }
}
