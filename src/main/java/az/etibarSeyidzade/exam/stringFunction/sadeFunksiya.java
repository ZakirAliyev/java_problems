package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class sadeFunksiya {

    public static double fun(double a) {

        return a + Math.sin(a);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        System.out.printf("%.4f", fun(a));
    }
}
