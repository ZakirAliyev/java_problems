package az.eolymp;

import java.util.Scanner;

public class Problem8241 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            // f(x, y) = x^2 + sin(x * y) - y^2

            System.out.printf("%.4f", x * x + Math.sin(x * y) - y * y);
            System.out.println();
        }
    }
}
