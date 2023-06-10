package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class funksiya5 {

    public static long funk(long x,long y,long z){
        return x*y*z+x+y*y+z*z*z;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=sc.nextInt();
        System.out.println(funk(a,b,c));
    }
}
