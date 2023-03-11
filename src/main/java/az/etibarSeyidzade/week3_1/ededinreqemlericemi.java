package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class ededinreqemlericemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int sum = 0;

        if (a.charAt(0) == '-') {
            for (int i = 1; i < a.length(); i++) {
                sum += (int) (a.charAt(i) - '0');
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                sum += (int) (a.charAt(i) - '0');
            }
        }

        System.out.println(sum);
    }
}
