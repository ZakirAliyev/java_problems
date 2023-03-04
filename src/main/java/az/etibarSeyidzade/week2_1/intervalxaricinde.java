package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class intervalxaricinde {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (n >= a && n <= b) {
            System.out.println("IN");
        } else {
            System.out.println("OUT");
        }
    }
}
