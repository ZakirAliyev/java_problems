package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class birinciyoxsaaxirinci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = n / 100 % 10;
        long b = n / 10 % 10;
        long c = n % 10;

        if (a > c) {
            System.out.println(a);
        } else if (c > a) {
            System.out.println(c);
        } else {
            System.out.println("=");
        }
    }
}
