package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class sifirolmayanreqemlerinhasili {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int has = 1;
        for (int i = 0; i < a.length(); i++) {
            int n = Integer.parseInt(String.valueOf(a.charAt(i)));
            if (n != 0) {
                has *= n;
            }
        }
        System.out.println(has);
    }
}
