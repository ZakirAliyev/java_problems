package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class cutreqemlerisilmeli {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        boolean flag = false;
        for (int i = 0; i < a.length(); i++) {
            int n = Integer.parseInt(String.valueOf(a.charAt(i)));
            if (n % 2 != 0) {
                System.out.print(n);
                flag = true;

            }
        }

        if (!flag) {
            System.out.println(0);
        }
    }
}