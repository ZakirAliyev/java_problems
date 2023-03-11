package az.etibarSeyidzade.week3_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ferqlireqemleriolaneded {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            String t = Integer.toString(i);
            Set<Character> set = new HashSet<>();

            for (int j = 0; j < 4; j++) {
                set.add(t.charAt(j));
            }

            if (set.size()==4) {
                System.out.print(t + " ");
            }
        }
    }
}
