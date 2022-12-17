package az.iktlab.lessons.repeat;

import java.util.Arrays;
import java.util.Scanner;

public class lesson17example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        StringBuilder c = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ' || i == a.length() - 1) {
                c.append(a.charAt(i));
                char[] charArray = c.toString().toCharArray();
                Arrays.sort(charArray);
                System.out.printf(new String(charArray) + " ");
                c = new StringBuilder();
            }
            else if (a.charAt(i) != ' ') {
                c.append(a.charAt(i));
                c = new StringBuilder(c.toString().toLowerCase());
            }
        }
    }
}
