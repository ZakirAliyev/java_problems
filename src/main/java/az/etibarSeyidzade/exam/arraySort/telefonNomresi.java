package az.etibarSeyidzade.exam.arraySort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class telefonNomresi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Character> set = new HashSet<>();
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > 47 && a.charAt(i) < 58) {
                set.add(a.charAt(i));
            }
        }

        System.out.println(10 - set.size());

        for (char i = 48; i < 58; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
