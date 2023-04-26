package az.etibarSeyidzade.week13_1;

import java.util.Scanner;

public class bolunme {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n % m == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println(n / m + " " + n % m);
        }
    }
}
