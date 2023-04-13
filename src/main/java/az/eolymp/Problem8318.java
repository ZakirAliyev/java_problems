package az.eolymp;

import java.util.Scanner;

public class Problem8318 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '3' && a.charAt(i) != '9') {
                System.out.print(a.charAt(i));
            }
        }
    }
}
