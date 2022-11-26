package az.iktlab.lessons.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MyThirdClass {

    public static void main(String[] args) {

        System.out.println("Let the game begin!\n");

        Random obj = new Random();

        int a = obj.nextInt(100);

        Scanner obj1 = new Scanner(System.in);

        System.out.printf("Please enter own name : ");
        String name = obj1.nextLine();

        while (true) {

            System.out.printf("Please enter the number : ");
            int b = obj1.nextInt();

            if (a > b)
                System.out.println("Your number is too small. Please, try again.\n");
            else if (a < b)
                System.out.println("Your number is too big. Please, try again.\n");
            else {
                System.out.printf("Congratulations, %s!\n", name);
                break;
            }
        }
    }
}
