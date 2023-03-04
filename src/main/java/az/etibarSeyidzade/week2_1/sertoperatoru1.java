package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class sertoperatoru1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n < 5) {
            System.out.println(n * n - 3 * n + 4);
        } else {
            System.out.println(n + 7);
        }
    }
}
