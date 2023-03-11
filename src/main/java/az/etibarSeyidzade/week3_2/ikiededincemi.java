package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class ikiededincemi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n * 2; i += 2) {
            int j = a[i] + a[i + 1];
            System.out.println(j);
        }
    }
}
