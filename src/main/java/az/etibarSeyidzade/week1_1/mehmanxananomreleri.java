package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class mehmanxananomreleri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long a, b, c;
        a = sc.nextLong();
        b = sc.nextLong();
        c = ((a - 1) * b * 3);
        if (a > 0 && b > 0) {
            System.out.println(c);
        }
    }
}
