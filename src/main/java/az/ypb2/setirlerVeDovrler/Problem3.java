package az.ypb2.setirlerVeDovrler;

import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int sum = 0;
        if (a.charAt(0)!='-') {
            for (int i = 0; i < a.length(); i++) {
                sum += (int) a.charAt(i) - 48;
            }
            System.out.println(sum);
        } else {
            for (int i = 1; i < a.length(); i++) {
                sum += (int) a.charAt(i) - 48;
            }
            System.out.println(sum);
        }
    }
}
