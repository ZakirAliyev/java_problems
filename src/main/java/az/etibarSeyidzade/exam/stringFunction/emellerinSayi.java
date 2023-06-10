package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class emellerinSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int b = a.length();
        int sum = 0;
        for (int i = 1; i < b; i++) {
            if (a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '*') {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
