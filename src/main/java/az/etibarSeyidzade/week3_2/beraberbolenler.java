package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class beraberbolenler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = 0;

        for (int i = 1; i < n; i++) {
            if (n / i == n % i) {
                a++;
            }
        }
        System.out.println(a);
    }
}
