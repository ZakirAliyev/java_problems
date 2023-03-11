package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class cevrilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n += 1;
            }
            sum += 1;
        }
        System.out.println(sum);
    }
}
