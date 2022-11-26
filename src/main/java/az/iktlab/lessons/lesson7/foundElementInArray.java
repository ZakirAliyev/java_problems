package az.iktlab.lessons.lesson7;

import java.util.Scanner;

public class foundElementInArray {

    public static void main(String[] args) {

        int c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + ".th number : ");
            a[i] = sc.nextInt();
        }
        System.out.printf("\nEnter the number you are looking for : ");
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == m) {
                System.out.println("\nNumber is found , a[" + i + "] = " + a[i] + " !!!");
                break;
            } else c++;
            if (c == n) System.out.println("\nNumber is not found !!!");
        }
    }
}
