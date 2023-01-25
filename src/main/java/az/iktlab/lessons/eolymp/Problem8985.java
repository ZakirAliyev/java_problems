package az.iktlab.lessons.eolymp;

import java.util.Scanner;

public class Problem8985 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != 'a') {
                System.out.print(a.charAt(i));
            }
        }
    }
}
