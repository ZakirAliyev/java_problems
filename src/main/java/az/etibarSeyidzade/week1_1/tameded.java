package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class tameded {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println((a * 7 + b - 2) * (a - c + 5));
    }
}
