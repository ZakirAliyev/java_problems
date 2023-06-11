package az.etibarSeyidzade.exam.arraySort;

import java.util.Arrays;
import java.util.Scanner;

public class enBoyuyuEvezle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int min = a[0], max = a[0];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == min) {
                System.out.print(max + " ");
            } else if (a[i] == max) {
                System.out.print(min + " ");
            } else {
                System.out.print(a[i]);
            }
        }
    }
}
