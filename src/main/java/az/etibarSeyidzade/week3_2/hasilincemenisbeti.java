package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class hasilincemenisbeti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0, has = 1;
        while (n != 0) {
            int m = n % 10;
            sum += m;
            has *= m;
            n /= 10;
        }
        double c = (sum == 0) ? 0 : (has / sum);
        System.out.printf("%.3f", c);
    }
}
