package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class agkubikler {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        long a= in.nextLong();
        long b=in.nextLong();
        long c= in.nextLong();
        long v = a*b*c;
        System.out.print(v);
        System.out.print(" ");
        System.out.print((6*v)-2*(a*b+a*c+b*c));

    }

}
