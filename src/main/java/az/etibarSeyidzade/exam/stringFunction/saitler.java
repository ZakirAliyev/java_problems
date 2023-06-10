package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class saitler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        a = a.toUpperCase();
        int sum = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'A'
                    || a.charAt(i) == 'E'
                    || a.charAt(i) == 'I'
                    || a.charAt(i) == 'O'
                    || a.charAt(i) == 'U'
                    || a.charAt(i) == 'Y') {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
