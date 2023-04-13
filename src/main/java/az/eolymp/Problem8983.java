package az.eolymp;

import java.util.Scanner;

public class Problem8983 {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        for (int j = 0; j < a.length(); j++) {
            for (char i = 48; i < 58; i++) {
                if (a.charAt(j) == i) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
