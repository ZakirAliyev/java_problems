package az.etibarSeyidzade.week3_3;

import java.util.Scanner;

public class denizquldurlarivesikkeler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0, sum1 = 0;
        while (true) {
            sum += a;
            if (sum <= b) {
                a++;
            } else {
                break;
            }
            sum1++;
        }
        System.out.println(sum1);
    }
}

