package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class dersnailiyyetlerininseviyyesi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n <= 3) {
            System.out.println("Initial");
        } else if (n <= 6) {
            System.out.println("Average");
        } else if (n <= 9) {
            System.out.println("Sufficient");
        } else {
            System.out.println("High");
        }
    }
}
