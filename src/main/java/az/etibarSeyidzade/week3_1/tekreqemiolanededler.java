package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class tekreqemiolanededler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            if (i / 1000 % 10 % 2 != 0) {
                if (i / 100 % 10 % 2 != 0) {
                    if (i / 10 % 10 % 2 != 0) {
                        if (i % 10 % 2 != 0) {
                            System.out.print(i + " ");
                        }
                    }
                }
            }
        }
    }
}
