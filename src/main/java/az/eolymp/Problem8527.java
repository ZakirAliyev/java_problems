package az.eolymp;

import java.util.Scanner;

public class Problem8527 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = b / a;
        int intValue = (int) Math.round(c);
        if (a == 0) {
            System.out.println();
        } else if (b / a == intValue) {
            System.out.println(intValue);
        } else if (a > 0 && b > 0) {
            System.out.print("-INF " + intValue);
        } else {
            System.out.println(intValue + " INF");
        }
    }
}
