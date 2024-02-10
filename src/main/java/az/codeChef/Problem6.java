package az.codeChef;

import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a + b + (a * b) == 111) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
