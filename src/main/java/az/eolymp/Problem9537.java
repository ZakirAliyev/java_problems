package az.eolymp;

import java.util.Scanner;

public class Problem9537 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int t = scanner.nextInt();
                a[i][j] = t;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
