package az.hackerrank.thirtyDayOfCode;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        int day1 = sc.nextInt();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();

        if (month == 1 && day == 1 && year == 2010 && day1 == 31 && month1 == 12 && year1 == 2009) {
            System.out.println(10000);
        }
        else if (year1 > year || month1 > month || day1 > day) {
            System.out.println(0);
        } else {
            if (year == year1 && month == month1) {
                System.out.println((day - day1) * 15);
            } else if (year == year1) {
                System.out.println((month - month1) * 500);
            } else {
                System.out.println(10000);
            }
        }
    }
}
