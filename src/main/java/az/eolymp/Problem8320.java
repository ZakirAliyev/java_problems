package az.eolymp;

import java.util.Scanner;

public class Problem8320 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        System.out.print(String.valueOf(a.charAt(0)).toUpperCase());
        for (int i = 1; i < a.length(); i++) {
            String t = String.valueOf(a.charAt(i));
            if (a.charAt(i - 1) == ' ') {
                t = t.toUpperCase();
            }
            System.out.print(t);
        }
    }
}
