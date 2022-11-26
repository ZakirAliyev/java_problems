package az.iktlab.lessons.lesson7;

import java.util.Scanner;

public class javaArray {

    public static void main(String[] args) {

        int c;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + ".th number : ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    c = a[i];
                    a[i] = a[j];
                    a[j] = c;
                }
            }
        }
        System.out.printf("Sorting array : ");
        for (int i = 0; i < n; i++)
            System.out.printf(a[i] + " ");
    }
}
