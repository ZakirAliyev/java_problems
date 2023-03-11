package az.etibarSeyidzade.week3_3;

import java.util.Scanner;

public class nomreleme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i < 7000; i++) {
            if (i < 10)
                n--;
            else if (i < 100)
                n -= 2;
            else if (i < 1000)
                n -= 3;
            else
                n -= 4;

            if (n == 0) {
                System.out.println(i);
                break;
            } else if (n < 0) {
                System.out.println(0);
                break;
            }
        }
    }
}
