package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class sozlerinSayi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int count = 0, i;
        str = sc.nextLine();

        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println(count + 1);
        sc.close();
    }
}
