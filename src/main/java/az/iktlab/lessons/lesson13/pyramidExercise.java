package az.iktlab.lessons.lesson13;

import java.util.Scanner;

public class pyramidExercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Number of rows : ");
        Integer n = sc.nextInt();

        Integer m = n, f = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(" ");
            }
            for (int x = 0; x < f; x++) {
                System.out.printf(String.valueOf(i));
            }
            f++;
            m--;
            System.out.println();
        }
    }
}
