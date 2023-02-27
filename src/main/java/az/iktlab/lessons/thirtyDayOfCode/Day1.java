package az.iktlab.lessons.thirtyDayOfCode;

import java.util.*;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine();
        String ad = scan.nextLine();
        System.out.println((int) (a + i));
        System.out.println(b + d);
        System.out.println(s + ad);
        scan.close();
    }
}