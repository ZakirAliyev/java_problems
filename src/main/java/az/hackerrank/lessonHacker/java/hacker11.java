package az.hackerrank.lessonHacker.java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class hacker11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(n);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(n);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(n);

        Locale INDIA = new Locale("en","IN");

        String india = NumberFormat.getCurrencyInstance(INDIA).format(n);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
