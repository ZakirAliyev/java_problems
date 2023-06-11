package az.etibarSeyidzade.exam.arraySort;

import java.util.Scanner;

public class elementleriSurusdur {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print(a[a.length - 1] + " ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}