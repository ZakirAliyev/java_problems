package az.etibarSeyidzade.week3_1;

import java.util.Scanner;

public class tekreqemlerinsayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int sum = 0;
        int n = a.length();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) % 2 != 0) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}

