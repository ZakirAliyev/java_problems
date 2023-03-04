package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class minimumvemaksimum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if (m > n) {
            System.out.println(n + " " + m);
        } else {
            System.out.println(m + " " + n);
        }
    }
}
