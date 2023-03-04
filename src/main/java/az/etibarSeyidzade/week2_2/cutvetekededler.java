package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class cutvetekededler {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
            System.out.println("NO");
        } else if (a % 2 != 0 && b % 2 != 0 && c % 2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
