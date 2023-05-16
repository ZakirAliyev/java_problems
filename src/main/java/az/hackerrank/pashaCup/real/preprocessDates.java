package az.hackerrank.pashaCup.real;

import java.util.Scanner;

public class preprocessDates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            String day = sc.next();
            String month = sc.next();
            String year = sc.next();
            System.out.print(year);
            if (month.equals("Jan")) {
                System.out.print("-01-");
            } else if (month.equals("Feb")) {
                System.out.print("-02-");
            } else if (month.equals("Mar")) {
                System.out.print("-03-");
            } else if (month.equals("Apr")) {
                System.out.print("-04-");
            } else if (month.equals("May")) {
                System.out.print("-05-");
            } else if (month.equals("Jun")) {
                System.out.print("-06-");
            } else if (month.equals("Jul")) {
                System.out.print("-07-");
            } else if (month.equals("Aug")) {
                System.out.print("-08-");
            } else if (month.equals("Sep")) {
                System.out.print("-09-");
            } else if (month.equals("Oct")) {
                System.out.print("-10-");
            } else if (month.equals("Nov")) {
                System.out.print("-11-");
            } else if (month.equals("Dec")) {
                System.out.print("-12-");
            }
            if (day.length() == 4) {
                System.out.print(day.charAt(0) + String.valueOf(day.charAt(1)));
            } else if (day.length() == 3) {
                System.out.print("0" + day.charAt(0));
            }
            System.out.println();
        }
    }
}
