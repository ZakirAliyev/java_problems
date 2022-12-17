package az.iktlab.lessons.lessonHacker.problemSolving;

import java.util.Scanner;

public class hacker2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, sum1 = 0;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
            sum1 += a[i][a.length - i - 1];
        }
        System.out.println(Math.abs(sum - sum1));
    }
}
