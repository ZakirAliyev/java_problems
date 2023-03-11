package az.etibarSeyidzade.week3_3;

import java.util.Scanner;

public class sifirlarinsayi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            sum += n / 5;
            n /= 5;
        }
        System.out.println(sum);
    }
}
