package az.ypb2.murekkebEdedler;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long sum = 0;
        while (sc.hasNext()) {
            long n = sc.nextLong();
            sum += n;
        }
        System.out.println(sum);
    }
}
