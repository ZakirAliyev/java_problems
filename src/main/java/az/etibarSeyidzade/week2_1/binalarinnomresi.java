package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class binalarinnomresi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n % 2 == 0 && m % 2 != 0) {
            System.out.println(0);
        } else if (n % 2 != 0 && m % 2 == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

    }
}
