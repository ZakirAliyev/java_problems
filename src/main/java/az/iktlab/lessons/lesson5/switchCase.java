package az.iktlab.lessons.lesson5;

import java.util.Scanner;

public class switchCase {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.printf("Please enter any number : ");
        int num = obj.nextInt();
        switch (num) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
                System.out.println("Aprobado");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
