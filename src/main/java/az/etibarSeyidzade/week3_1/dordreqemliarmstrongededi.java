package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class dordreqemliarmstrongededi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if ((i / 1000 % 10) * (i / 1000 % 10) * (i / 1000 % 10)* (i / 1000 % 10) +
                    (i / 100 % 10) * (i / 100 % 10) * (i / 100 % 10)* (i / 100 % 10) +
                    (i / 10 % 10) * (i / 10 % 10) * (i / 10 % 10)* (i / 10 % 10) +
                    (i % 10) * (i % 10) * (i % 10)* (i % 10) == i) {
                System.out.print(i + " ");
            }
        }
    }
}
