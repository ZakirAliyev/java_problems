package az.etibarSeyidzade.week4_2;

import java.util.Scanner;

public class mesveretqayasi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n > max) {
                max = n;
            }
            if (m < min) {
                min = m;
            }
        }
        System.out.println(min - max + 1);
    }
}
