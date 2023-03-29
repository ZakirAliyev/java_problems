package az.etibarSeyidzade.week4_1;

import java.util.Scanner;

public class elementlerincemi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        double cem = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            cem += a[i];
        }
        System.out.print(cem);
    }
}
