package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {

        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.printf("\nEnter the count of number : ");
        int n = obj.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf((i + 1) + ". number : ");
            int a = obj.nextInt();
            sum += a;
        }
        System.out.printf("\nSum of numbers :  %s\n", sum);
    }
}
