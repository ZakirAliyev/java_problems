package az.etibarSeyidzade.kollok1;

import java.util.Scanner;

public class musbetmenfisifir {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n > 0) {
            System.out.println("Positive");
        } else if (n == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }
}