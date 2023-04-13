package az.eolymp;

import java.util.Scanner;

public class Problem8986 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int i = sc.nextInt();
        int j = sc.nextInt();

        for (int k = 0; k < a.length(); k++) {
            if (k < i || k > j) {
                System.out.print(a.charAt(k));
            }
        }
    }
}
