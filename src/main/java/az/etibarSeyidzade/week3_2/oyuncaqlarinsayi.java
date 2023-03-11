package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class oyuncaqlarinsayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] a = new int[n * 2];
        double[] b = new double[n * 2];
        for (int i = 0; i < n * 2; i += 2) {
            a[i] = sc.nextInt();
            b[i + 1] = sc.nextDouble();
        }
        for (int i = 0; i < n * 2; i += 2) {
            if (b[i + 1] < 50) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
