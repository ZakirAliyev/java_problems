package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class ucreqemliededinreqemlerinideyismek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();

        long a = n / 100 % 10;
        long b = n / 10 % 10;
        long c = n % 10;

        if (n == 100) {
            System.out.print(1);
        } else if (c == 0) {
            System.out.println(b + "" + a);
        } else {
            System.out.print(c + "" + b + "" + a);
        }
    }
}
