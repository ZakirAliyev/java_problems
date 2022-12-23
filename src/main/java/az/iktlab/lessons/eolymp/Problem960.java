package az.iktlab.lessons.eolymp;

import java.util.Scanner;

public class Problem960 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double rb = sc.nextDouble(), rk = sc.nextDouble(), hb = sc.nextDouble();
        double lb = Math.sqrt(Math.pow(rb, 2) + Math.pow(hb, 2));
        double hk = (rk * hb) / rb;
        double lk = Math.sqrt(Math.pow(rk, 2) + Math.pow(hk, 2));
        double sb = Math.PI * rb * lb;
        double sk = Math.PI * rk * lk;
        double s = sb - sk + Math.PI * Math.pow(rk, 2) + Math.PI * Math.pow(rb, 2);
        System.out.printf("%.2f", s);
    }
}
