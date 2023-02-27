package az.iktlab.lessons.codeforces;

import java.util.Scanner;

public class A208 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        a = a.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'W') {
                if (a.charAt(i + 1) == 'U') {
                    if (a.charAt(i + 2) == 'B') {
                        i++;
                    }
                }
            }
        }
    }
}
