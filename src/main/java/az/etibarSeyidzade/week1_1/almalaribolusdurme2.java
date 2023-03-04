package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class almalaribolusdurme2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        System.out.println(m % n);
    }
}