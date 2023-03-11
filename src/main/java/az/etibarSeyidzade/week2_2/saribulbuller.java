package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class saribulbuller {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0) {
            System.out.print(a / b);
        } else {
            System.out.print(a / b + 1);
        }
        System.out.print(" " + (a - b + 1));
    }
}
