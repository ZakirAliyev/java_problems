package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class ededinbirincireqemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();

        if (a.charAt(0) == '-') {
            System.out.println(a.charAt(1));
        } else {
            System.out.println(a.charAt(0));
        }
    }
}

