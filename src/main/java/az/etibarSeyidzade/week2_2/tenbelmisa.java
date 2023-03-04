package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class tenbelmisa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        System.out.println(Math.min(n, Math.min(b, a)));

    }
}
