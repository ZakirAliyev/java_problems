package az.etibarSeyidzade.week4_2;

import java.util.Scanner;

public class universalrozetka {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        boolean isZero = false;
        boolean isPhase = false;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int t = sc.nextInt();
            if (t == 0) {
                if (y <= d && y >= -d) {
                    isZero = true;
                }
            } else {
                if (y <= d - 1 && y >= -d + 1) {
                    isPhase = true;
                }
            }
        }
        if (isZero && isPhase) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
