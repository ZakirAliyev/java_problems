package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class ededebolunme {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long n = sc.nextLong();
        long m = sc.nextLong();

        if (a % n == 0 && a % m == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
