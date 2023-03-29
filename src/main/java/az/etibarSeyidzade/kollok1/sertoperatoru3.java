package az.etibarSeyidzade.kollok1;

import java.util.Scanner;

public class sertoperatoru3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n < -4) {
            System.out.println(n + 5);
        } else if (n >= -4 && n <= 7) {
            System.out.println(n * n - 3 * n);
        } else {
            System.out.println(n * n * n + 2 * n);
        }
    }
}
