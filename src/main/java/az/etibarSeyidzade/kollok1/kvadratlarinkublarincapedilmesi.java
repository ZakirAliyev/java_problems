package az.etibarSeyidzade.kollok1;

import java.util.Scanner;

public class kvadratlarinkublarincapedilmesi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextInt();
        long m = sc.nextInt();

        for (long i = n; i <= m; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
        for (long i = m; i >= n; i--) {
            System.out.print(i * i * i + " ");
        }
    }
}
