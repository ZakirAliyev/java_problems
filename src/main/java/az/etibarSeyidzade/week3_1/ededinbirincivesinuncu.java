package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class ededinbirincivesinuncu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int n = a.length();
        int has;

        if (a.charAt(0) == '-') {
            has = (int) (a.charAt(1) - '0') + (int) (a.charAt(n - 1) - '0');
        } else {
            has = (int) (a.charAt(0) - '0') + (int) (a.charAt(n - 1) - '0');
        }

        System.out.println(has);
    }
}

