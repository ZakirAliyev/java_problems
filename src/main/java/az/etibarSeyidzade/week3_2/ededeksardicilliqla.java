package az.etibarSeyidzade.week3_2;

import java.util.Scanner;

public class ededeksardicilliqla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int n = a.length();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a.charAt(i));
        }
    }
}
