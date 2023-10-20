package az.codeforces;

import java.util.Scanner;

public class A1228 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag1 = true;

        for (int i = a; i <= b; i++) {
            boolean flag = true;
            int y = 0;
            String n = String.valueOf(i);
            for (int j = 0; j < n.length(); j++) {
                for (int k = j + 1; k < n.length(); k++) {
                    if (n.charAt(j) == n.charAt(k)) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                System.out.println(n);
                flag1 = false;
                break;
            }
        }
        if (flag1) {
            System.out.println(-1);
        }
    }
}
