package az.hackerrank.lessonHacker.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hacker36 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}