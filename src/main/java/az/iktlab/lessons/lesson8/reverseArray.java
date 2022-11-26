package az.iktlab.lessons.lesson8;

import java.lang.reflect.Array;
import java.util.Scanner;

public class reverseArray {

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

        int j = n - 1;
        for (int i = 0; i < n / 2; i++) {
            c=a[i];
            a[i]=a[j];
            a[j]=c;
            j--;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i] + " ");
        }

    }
}
