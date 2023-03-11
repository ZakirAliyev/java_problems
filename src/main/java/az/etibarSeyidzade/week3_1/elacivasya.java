package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class elacivasya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        int b = a.length();
        int sum = 0;

        for (int i = 0; i < b; i++) {
            if (a.charAt(i) == '5') {
                sum++;
            }
        }

        System.out.println(sum);
    }
}

