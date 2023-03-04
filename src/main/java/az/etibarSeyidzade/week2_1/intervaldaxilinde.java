package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class intervaldaxilinde {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (a >= x && a <= y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
