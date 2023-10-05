package az.eolymp;

import java.util.Scanner;

public class Problem7366 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long day = n / 86400;
        long hour = n % 86400 / 3600;
        long minute = n % 86400 % 3600 / 60;
        long second = n % 86400 % 3600 % 60;

        System.out.print(day + " " + hour + " " + minute + " " + second);
    }
}
