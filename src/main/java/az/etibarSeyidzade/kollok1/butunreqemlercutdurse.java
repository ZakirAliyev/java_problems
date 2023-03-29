package az.etibarSeyidzade.kollok1;

import java.util.Scanner;

public class butunreqemlercutdurse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean flag = false;

        while (n != 0) {
            if (n % 10 % 2 != 0) {
                flag = true;
                break;
            }
            n /= 10;
        }

        if (flag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
