package az.iktlab.lessons.eolymp;

import java.util.Scanner;

public class Problem8988 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        for (int i = 1; i < a.length(); ) {
            if (a.charAt(i - 1) == 'a' && a.charAt(i) == 'b') {
                System.out.print("ups");
                i += 2;
            } else {
                System.out.print(a.charAt(i - 1));
                i++;
            }
        }
        System.out.print(a.charAt(a.length() - 1));
    }
}
