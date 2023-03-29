package az.etibarSeyidzade.week5_1;

import java.util.Scanner;

public class yulisezarsifresi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        a = a.toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) - n >= 65)
                System.out.print(Character.valueOf((char) (a.charAt(i) - n)));
            else {
                int y = a.charAt(i) - 65;
                System.out.print(Character.valueOf((char) (91 - n + y)));
            }
        }
    }
}
