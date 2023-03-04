package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class reqemlerinhasili {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = n / 100 % 10;
        long b = n / 10 % 10;
        long c = n % 10;
        System.out.println(a * b * c);
    }
}
