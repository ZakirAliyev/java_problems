package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class ceminkavdrati {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int z = (n / 10 % 10) + (n % 10);

        System.out.println(z * z);
    }
}
