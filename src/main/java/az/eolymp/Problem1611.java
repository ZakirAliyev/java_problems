package az.eolymp;

import java.util.Scanner;

public class Problem1611 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        int i = sc.nextInt();
        int j = sc.nextInt();

        for (int k = 0; k < a.length(); k++) {
            if (k == i - 1)
                System.out.print(a.charAt(j-1));
            else if (k == j - 1)
                System.out.print(a.charAt(i-1));
            else
                System.out.print(a.charAt(k));
        }
    }
}
