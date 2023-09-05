package az.eolymp.adaDay1;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while (n-- != 0) {

            String a = sc.next();

            for (int i = 0; i < a.length(); i++) {

                sum += (a.charAt(i) == 'A') ? 4 :
                        (a.charAt(i) == 'K') ? 3 :
                                (a.charAt(i) == 'Q') ? 2 :
                                        (a.charAt(i) == 'J') ? 1 : 0;
            }
        }

        System.out.println(sum);
    }
}
