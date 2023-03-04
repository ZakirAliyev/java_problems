package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class sgnfunksiyasi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n > 0) {
            System.out.println(1);
        } else if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
