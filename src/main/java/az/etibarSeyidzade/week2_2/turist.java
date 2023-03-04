package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class turist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int w = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        if (((k <= b1) && (w >= a1)) || ((k <= b2) && (w >= a2)) || ((k <= b3) && (w >= a3)) || ((k <= b1 + b2) && (w >= a1 + a2)) || ((k <= b2 + b3) && (w >= a2 + a3)) || ((k <= b1 + b3) && (w >= a1 + a3)) || ((k <= b1 + b2 + b3) && (w >= a1 + a2 + a3))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
