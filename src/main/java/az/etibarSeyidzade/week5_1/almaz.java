package az.etibarSeyidzade.week5_1;

import java.util.Scanner;

public class almaz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int t = sc.nextInt();
            if (t == 0) {
                break;
            }
            int z = t;
            int j = -1;
            for (int i = 0; i < t; i++) {
                j += 2;
                z--;
                for (int k = 0; k < z; k++) {
                    System.out.print(" ");
                }
                for (int q = 0; q < j; q++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 0; i < t - 1; i++) {
                j -= 2;
                z++;
                for (int k = 0; k < z; k++) {
                    System.out.print(" ");
                }
                for (int q = 0; q < j; q++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
