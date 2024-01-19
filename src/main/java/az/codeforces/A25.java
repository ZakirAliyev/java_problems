package az.codeforces;

import java.util.Scanner;

public class A25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int say1 = 0, say2 = 0, idx1 = 0, idx2 = 0, i = 0;
        while (t-- > 0) {
            int a = sc.nextInt();
            if (a % 2 == 0) {
                say1++;
                idx1 = i;
            } else {
                say2++;
                idx2 = i;
            }
            i++;
        }
        if (say1 == 1) {
            System.out.println(idx1 + 1);
        } else {
            System.out.println(idx2 + 1);
        }
    }
}
