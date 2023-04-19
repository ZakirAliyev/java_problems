package az.eolymp;

import java.util.Scanner;

public class Problem8619 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        boolean flag = true;

        for (int i = 1; i < a.length(); i++) {
            if (a.charAt(i - 1) >= a.charAt(i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
