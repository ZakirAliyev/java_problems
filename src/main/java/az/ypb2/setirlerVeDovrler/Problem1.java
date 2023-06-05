package az.ypb2.setirlerVeDovrler;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String a = sc.next();
        String c = sc.next();
        char b = c.charAt(0);
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
