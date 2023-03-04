package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class ilinfesilleri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if ((n > 0 && n < 3) || n == 12) {
            System.out.println("Winter");
        } else if (n > 2 && n < 6) {
            System.out.println("Spring");
        } else if (n > 4 && n < 9) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }
}
