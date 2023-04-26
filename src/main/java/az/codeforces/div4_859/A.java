package az.codeforces.div4_859;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(c-b==a)
                System.out.println("+");
            else System.out.println("-");
        }
    }
}
