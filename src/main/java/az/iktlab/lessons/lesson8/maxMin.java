package az.iktlab.lessons.lesson8;

import java.util.Scanner;

public class maxMin {

    public static void main(String[] args) {

        int c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter array size : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + ". number : ");
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }

        System.out.println("max = " + max + "\nmin = " + min);
    }
}
