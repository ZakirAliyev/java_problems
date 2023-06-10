package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class funksiya1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n, f;
        while (scanner.hasNextDouble()) {
            n = scanner.nextDouble();
            f = Math.pow(n, 3) + 2 * Math.pow(n, 2) - 3;
            System.out.printf("%.4f\n", f);
        }
        scanner.close();
    }

}
