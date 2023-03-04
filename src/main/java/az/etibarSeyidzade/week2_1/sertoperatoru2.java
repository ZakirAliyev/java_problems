package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class sertoperatoru2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n >= 10) {
            System.out.println(n * n * n + 5 * n);
        } else {
            System.out.println(n * n - 2 * n + 4);
        }
    }
}
