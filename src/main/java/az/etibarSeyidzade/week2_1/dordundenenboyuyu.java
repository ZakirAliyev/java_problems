package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class dordundenenboyuyu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));
    }
}
