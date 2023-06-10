package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class funksiyaninCedvellesdirilmesi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        while (a <= b) {
            System.out.printf("%.3f ", a);
            System.out.printf("%.3f\n", 3 * Math.sin(a));
            a += h;
        }
    }
}
