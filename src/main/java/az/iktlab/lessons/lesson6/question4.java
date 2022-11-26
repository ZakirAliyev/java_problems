package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class question4 {

    public static void main(String[] args) {

        int a = 0,m;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number : ");
        int n = sc.nextInt();
        while (n != 0) {
            m = n % 10;
            a = a * 10 + m;
            n = n / 10;
        }
        System.out.printf("Reversed number : %s",a);
    }
}
