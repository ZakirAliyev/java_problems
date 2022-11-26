package az.iktlab.lessons.lesson7;

import java.util.Scanner;

public class averageArray {

    public static void main(String[] args) {

        double sum = 0, m;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number : ");
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + ".th number : ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        m = sum / n;
        System.out.printf("\nAvarage if array elements : " + m);
    }
}
