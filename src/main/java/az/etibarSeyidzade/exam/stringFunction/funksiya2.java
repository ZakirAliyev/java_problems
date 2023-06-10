package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class funksiya2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n, a;
        while (scanner.hasNextDouble()) {
            n = scanner.nextDouble();
            a = Math.sqrt(n) + 2 * n + Math.sin(n);
            System.out.printf("%.4f\n", a);
        }
    }
}
