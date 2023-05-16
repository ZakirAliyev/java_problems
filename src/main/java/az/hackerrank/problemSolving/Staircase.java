package az.hackerrank.problemSolving;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), f = n - 1, u = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < u; j++) {
                System.out.print("#");
            }
            f--;
            u++;
            System.out.println();
        }
    }
}
