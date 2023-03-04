package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class suvebuz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n > 0) {
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }
    }
}
