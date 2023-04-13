package az.eolymp;

import java.util.Scanner;

public class Problem8571 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.next();
        a = a.toLowerCase();
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(0)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
