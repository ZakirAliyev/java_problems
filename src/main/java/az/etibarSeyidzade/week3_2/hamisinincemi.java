package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class hamisinincemi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        while (sc.hasNext()) {
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println(sum);
    }
}
