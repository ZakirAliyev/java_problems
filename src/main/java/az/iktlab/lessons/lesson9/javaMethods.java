package az.iktlab.lessons.lesson9;

import java.util.Scanner;

public class javaMethods {

    public static void main(String[] args) {

        System.out.println("================> WELCOME <================\n");
        int say = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the string: ");
        String n = sc.next();
        middleCharacter(n);
        findVowelCharacter(n, say);
        int a = 1, b = 1;
        findPentagonalNumber(a, b);
        double x,y,z;
        System.out.printf("\nEnter x value : ");
        x = sc.nextDouble();
        System.out.printf("Enter y value : ");
        y = sc.nextDouble();
        System.out.printf("Enter z value : ");
        z = sc.nextDouble();
        System.out.println("Minimum value is : "+findSmallestNumber(x,y,z));
        System.out.println("\n===============> GOOD BYE <===============");
    }
    public static void middleCharacter(String n) {

        if (n.length() % 2 == 0) {
            System.out.println("The middle Character: " + n.charAt(n.length() / 2 - 1) + n.charAt(n.length() / 2));
        } else {
            System.out.println("The middle Character : " + n.charAt(n.length() / 2));
        }
    }

    public static void findVowelCharacter(String n, int say) {
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'a' || n.charAt(i) == 'e' || n.charAt(i) == 'i' || n.charAt(i) == 'o' || n.charAt(i) == 'u') {
                say++;
            }
        }
        System.out.println("Count of vowels : " + say);
    }

    public static void findPentagonalNumber(int a, int b) {
        System.out.println("\nPentagonal numbers : ");
        for (int i = 1; i <= 50; i++) {
            System.out.printf(b + " ");
            a += 3;
            b += a;
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static double findSmallestNumber(double x,double y,double z){
        double mi = Math.min(x, Math.min(y, z));
        return mi;
    }
}