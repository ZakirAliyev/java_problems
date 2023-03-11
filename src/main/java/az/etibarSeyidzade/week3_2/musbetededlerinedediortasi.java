package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class musbetededlerinedediortasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0, sum1 = 0;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                sum += a[i];
                sum1++;
            }
        }
        double z = (sum1 == 0) ? 0 : (sum / sum1);
        if (sum1 == 0) {
            System.out.println("Not Found");
        } else {
            System.out.printf("%.2f", z);
        }
    }
}