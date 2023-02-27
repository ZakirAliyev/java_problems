package az.iktlab.lessons.thirtyDayOfCode;

import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double sum = (b * n / 100) + (a * n / 100) + n;

        System.out.println(Math.round(sum));

    }
}

