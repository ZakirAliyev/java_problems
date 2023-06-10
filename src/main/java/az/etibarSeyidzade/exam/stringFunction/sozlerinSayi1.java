package az.etibarSeyidzade.exam.stringFunction;

import java.util.Arrays;
import java.util.Scanner;

public class sozlerinSayi1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder b = new StringBuilder();
        String a = sc.nextLine();

        a = a.trim();

        for (int i = 1; i < a.length(); ) {
            if ((a.charAt(i - 1) == ' ' && a.charAt(i) == ' ') ||
                    (a.charAt(i - 1) == '-' && a.charAt(i) == ' ')) {
                i += 2;
            } else {
                b.append(a.charAt(i));
                i++;
            }
        }

        String c = String.valueOf(b);

        System.out.println(Arrays.stream(c.split("[ ]")).toArray().length);
    }
}