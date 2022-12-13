package az.iktlab.lessons.lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            long a = sc.nextLong();
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            if (e instanceof InputMismatchException) {
                System.out.println("Error");
            } else if (e instanceof IndexOutOfBoundsException) {
                System.out.println("ERROR");
            }
        }
    }
}
