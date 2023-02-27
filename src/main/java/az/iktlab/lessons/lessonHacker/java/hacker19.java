package az.iktlab.lessons.lessonHacker.java;

import java.util.Scanner;

public class hacker19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, max = Integer.MIN_VALUE;
        int n = 6, m = 6;
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                sum += (a[i][j] + a[i][j + 1] + a[i][j + 2]
                        + a[i + 1][j + 1]
                        + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2]);
                if (sum > max)
                    max = sum;
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
