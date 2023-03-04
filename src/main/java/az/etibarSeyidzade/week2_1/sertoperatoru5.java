package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class sertoperatoru5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n >= 13) {
            System.out.println(3 * n * n * n + 4 * n * n + 5 * n + 6);
        } else {
            System.out.println(3 * n * n * n - 2 * n * n - 3 * n - 4);
        }
    }
}
