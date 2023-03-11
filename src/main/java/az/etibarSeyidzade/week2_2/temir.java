package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class temir {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int h = sc.nextInt();
            int s = (a + b) * 2 * h;
            if (s % 16 != 0)
                System.out.println(s / 16 + 1);
            else System.out.println(s / 16);
        }
    }
}
