package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class olimpiada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();
        long f = sc.nextLong();

        System.out.printf("%s %s %s", d - a, e - b, f - c);
    }
}
