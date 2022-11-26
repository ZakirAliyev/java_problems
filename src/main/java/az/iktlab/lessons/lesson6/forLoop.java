package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int sum = 0, sum1 = 0, sum2 = 0;

        boolean flag = false;

        while (true) {

            System.out.printf("\nPlease enter the number : ");
            int n = obj.nextInt();
            System.out.printf("Do you continue?");
            System.out.println("\nYes : 1");
            System.out.println("No : 2");
            System.out.printf("Enter you choise : ");

            int a = obj.nextInt();

            if (n > 0) sum++;
            else if (n < 0) sum1++;
            else sum2++;

            switch (a) {
                case 1:
                    flag = true;
                    continue;
                case 2:
                    break;
            }
            if (flag == true)
                break;
        }

        System.out.println("");
        System.out.printf("\nCount of positife number : %s", sum);
        System.out.printf("\nCount of negative number : %s", sum1);
        System.out.printf("\nCount of zeros : %s\n", sum2);
    }
}
