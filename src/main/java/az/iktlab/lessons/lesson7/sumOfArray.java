package az.iktlab.lessons.lesson7;

import java.util.Scanner;

public class sumOfArray {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + ".th number : ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        System.out.printf("\nSum of array = " + sum);
    }
}
