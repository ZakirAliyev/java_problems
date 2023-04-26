package az.etibarSeyidzade.week13_1;

import java.util.Scanner;

public class javaarithmeticexception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            try {
                System.out.println(n / m);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        }
    }
}