package az.etibarSeyidzade.week13_1;

import java.util.Scanner;

public class qaliq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int c = n % 10;
        int a = n / 100 % 10;
        int x = c % a;
        System.out.println(x);
    }
}
