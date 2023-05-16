package az.eolymp;

import java.util.Scanner;

public class Problem10029 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a - b + c == 2020) {
            System.out.println(a + "-" + b + "+" + c);
        } else if (a + b + c == 2020) {
            System.out.println(a + "+" + b + "+" + c);
        } else if (a - b - c == 2020) {
            System.out.println(a + "-" + b + "-" + c);
        } else if (a + b - c == 2020) {
            System.out.println(a + "+" + b + "-" + c);
        } else {
            System.out.println("CORONA");
        }
    }
}
