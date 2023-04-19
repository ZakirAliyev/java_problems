package az.eolymp;

import java.util.Scanner;

public class Problem8618 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        if (n.charAt(0) == n.charAt(3) && n.charAt(1) == n.charAt(2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
