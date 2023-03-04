package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class gencbagban {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0, n, a = 2;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum += a;
            a += 2;
        }
        System.out.print(sum + 1);
    }
}
