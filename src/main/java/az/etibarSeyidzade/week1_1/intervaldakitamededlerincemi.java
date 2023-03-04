package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class intervaldakitamededlerincemi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long sum = 0;
        long n = sc.nextLong();
        long m = sc.nextLong();

        sum = ((n + m) * (m - n + 1)) / 2;

        System.out.println(sum);
    }
}
