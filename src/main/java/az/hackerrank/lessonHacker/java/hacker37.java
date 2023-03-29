package az.hackerrank.lessonHacker.java;

import java.util.Scanner;

class MyCalculator111 {

    public static int power(int n, int p) throws Exception {
        if ((n >= 0 && p > 0) || (n > 0 && p >= 0)) {
            return (int) Math.pow(n, p);
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            throw new Exception("n and p should not be zero.");
        }
    }
}

public class hacker37 {
    public static final MyCalculator111 my_calculator = new MyCalculator111();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}