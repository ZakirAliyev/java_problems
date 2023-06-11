package az.etibarSeyidzade.exam.arraySort;

import java.util.Scanner;

public class ikiBes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] <= 2.5) {
                System.out.print(i + 1 + " ");
                System.out.printf("%.2f", a[i]);
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("Not Found");
    }
}
