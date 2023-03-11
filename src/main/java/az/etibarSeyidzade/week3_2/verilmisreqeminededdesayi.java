package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class verilmisreqeminededdesayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        char b = input.next().charAt(0);
        int sum = 0;

        if (a.charAt(0) == '-') {
            for (int i = 1; i < a.length(); i++) {
                if (a.charAt(i) == b) {
                    sum++;
                }
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
