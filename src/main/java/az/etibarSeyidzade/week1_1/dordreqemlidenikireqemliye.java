package az.etibarSeyidzade.week1_1;

import java.util.Scanner;

public class dordreqemlidenikireqemliye {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println((n / 100 % 10)*10 + n / 10 % 10);
    }
}
