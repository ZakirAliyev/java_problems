package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class funksiya4 {

    public static long funksiya(long a) {
        return 1 + a + a * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        System.out.print(funksiya(s));
    }
}
