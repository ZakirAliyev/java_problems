package az.etibarSeyidzade.week3_3;

import java.util.Scanner;

public class reqemler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long a = 0;
        if (n == 0) {
            System.out.println(1);
        } else if (n > 0) {
            while (n > 0) {
                n = n / 10;
                a += 1;
            }
            System.out.println(a);
        }
    }
}