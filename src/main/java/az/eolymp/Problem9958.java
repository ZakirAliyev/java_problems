package az.eolymp;

import java.util.Scanner;

public class Problem9958 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), say = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m < 0 && m % 2 != 0) {
                sum += m;
                say++;
            }
        }
        if (say == 0) {
            System.out.println("NO");
        } else {
            double avg = sum / say;
            System.out.printf("%.2f", avg);
        }
    }
}