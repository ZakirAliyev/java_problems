package az.codeChef;

import java.util.Scanner;

public class Problem14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print((a - b) + " " + (a - b - c));
    }
}
