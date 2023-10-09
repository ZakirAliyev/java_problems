package az.codeforces;

import java.util.Scanner;

public class A378 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int acount = 0;
        int bcount = 0;
        int equal = 0;

        for (int i = 1; i <= 6; i++) {
            if (Math.abs(a - i) < Math.abs(b - i)) {
                acount++;
            } else if (Math.abs(a - i) > Math.abs(b - i)) {
                bcount++;
            } else {
                equal++;
            }
        }

        System.out.println(acount + " " + equal + " " + bcount);
    }
}
