package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class deyisdirme {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- != 0) {

            long n = sc.nextLong();

            if (n % 3 == 1) {
                System.out.println("VGC");
            } else if (n % 3 == 2) {
                System.out.println("CVG");
            } else {
                System.out.println("GCV");
            }
        }
    }
}
