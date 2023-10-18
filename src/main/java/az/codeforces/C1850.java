package az.codeforces;

import java.util.Scanner;

public class C1850 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder();
            for (int z = 0; z < 8; z++) {
                String a = sc.nextLine();
                for (int j = 0; j < a.length(); j++) {
                    if (Character.isLetter(a.charAt(j))) {
                        str.append(a.charAt(j));
                    }
                }
            }
            System.out.println(str);
        }
    }
}
