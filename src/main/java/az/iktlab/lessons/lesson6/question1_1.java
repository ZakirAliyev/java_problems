package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class question1_1 {

    public static void main(String[] args) {

        long f,f1=1,f2=-1;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter the number : ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            f=f1+f2;
            System.out.println((i+1)+"th fibonacci number : "+f);
            f2=f1;
            f1=f;
        }
    }
}
