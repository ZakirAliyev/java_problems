package az.eolymp;

import java.util.Scanner;

public class Problem8519 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            if ((int) a.charAt(i) % 2 == 0) {
                sum += a.charAt(i) - 48;
            }
        }
        System.out.println(sum);
    }
}
