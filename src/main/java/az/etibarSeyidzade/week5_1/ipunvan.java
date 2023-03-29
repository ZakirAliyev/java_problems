package az.etibarSeyidzade.week5_1;

import java.util.Scanner;

public class ipunvan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setir = scanner.nextLine();
        String[] massiv = setir.split("\\.");
        int a = massiv[0].equals("") ? -1 : Integer.parseInt(massiv[0]);
        int b = massiv[1].equals("") ? -1 : Integer.parseInt(massiv[1]);
        int c = massiv[2].equals("") ? -1 : Integer.parseInt(massiv[2]);
        int d = massiv[3].equals("") ? -1 : Integer.parseInt(massiv[3]);
        if (a < 0 || a > 255) {
            System.out.println(0);
        } else if (b < 0 || b > 255) {
            System.out.println(0);
        } else if (c < 0 || c > 255) {
            System.out.println(0);
        } else if (d < 0 || d > 255) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        scanner.close();
    }
}