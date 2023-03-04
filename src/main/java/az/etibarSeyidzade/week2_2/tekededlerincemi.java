package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class tekededlerincemi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n % 2 == 0)
            n++;
        if (m % 2 == 0)
            m--;

        System.out.println((n + m) * (m - n + 2) / 4);
    }
}
