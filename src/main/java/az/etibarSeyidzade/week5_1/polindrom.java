package az.etibarSeyidzade.week5_1;

import java.util.Objects;
import java.util.Scanner;

public class polindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder b = new StringBuilder();
        StringBuilder c = new StringBuilder();
        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != ' ') {
                b.append(a.charAt(i));
            }
        }

        for (int i = b.length() - 1; i >= 0; i--) {
            c.append(b.charAt(i));
        }

        if (Objects.equals(String.valueOf(b), String.valueOf(c))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
