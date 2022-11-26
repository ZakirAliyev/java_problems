package az.iktlab.lessons.lesson5;

import java.util.Scanner;

public class ifElseStatement {

    public static void main(String[] args) {

        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Please enter the letter : ");
        String c = sc.nextLine();
        c = c.toLowerCase();

        String[] a = {"a", "o", "u", "i", "e", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
        String[] b = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};

        for (int i = 0; i < b.length; i++) {
            if (a[i].equals(c)) {
                System.out.println("Input letter is vowel");
                break;
            } else if (b[i].equals(c)) {
                System.out.println("Input letter is consonant");
                break;
            } else sum++;
        }
        if (sum > 20) System.out.println("ERROR 404!!!");
    }
}
