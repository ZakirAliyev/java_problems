package az.codeChef;

import java.util.Scanner;

public class Problem4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
