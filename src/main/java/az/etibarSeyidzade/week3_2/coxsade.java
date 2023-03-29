package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class coxsade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long t = n, sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * t;
            t *= a;
        }

        if (n == 1) {
            System.out.println(n * (n + 1) / 2);
        } else {
            System.out.println(sum);
        }
    }
}
