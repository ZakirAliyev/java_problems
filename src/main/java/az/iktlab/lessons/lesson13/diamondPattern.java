package az.iktlab.lessons.lesson13;

import java.util.Scanner;

public class diamondPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Number of rows : ");
        Integer n = sc.nextInt();
        System.out.println();

        Integer m = n, f = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(" ");
            }
            for (int x = 0; x < f; x++) {
                System.out.printf("*");
            }
            System.out.println("");
            m--;
            f += 2;
        }
        for (int i = 0; i < n; i++) {
            m++;
            f -= 2;
            for (int j = 0; j < m; j++) {
                System.out.printf(" ");
            }
            for (int x = 0; x < f; x++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
