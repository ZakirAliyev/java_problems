package az.iktlab.lessons.lesson14;
import java.util.Scanner;

public class pyramidAlpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter number : ");
        Integer n = sc.nextInt(),m = 0, f = 0;
        char a = '@';
        for (int i = 0; i < n; i++) {
            m++;
            f++;
            for (int j = 0; j < n - f; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < m; j++) {
                a++;
                System.out.printf(String.valueOf(a));
            }
            for (int j = 0; j < m - 1; j++) {
                a--;
                System.out.printf(String.valueOf(a));
            }
            a = '@';
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            m--;
            f--;
            for (int j = 0; j < n - f; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < m; j++) {
                a++;
                System.out.printf(String.valueOf(a));
            }
            for (int j = 0; j < m - 1; j++) {
                a--;
                System.out.printf(String.valueOf(a));
            }
            a = '@';
            System.out.println();
        }
    }
}