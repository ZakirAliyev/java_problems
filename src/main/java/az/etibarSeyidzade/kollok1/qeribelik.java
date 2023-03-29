package az.etibarSeyidzade.kollok1;

import java.util.Scanner;

public class qeribelik {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        }
    }
}
