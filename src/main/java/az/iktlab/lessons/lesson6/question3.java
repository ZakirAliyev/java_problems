package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {

        int has=1;
        Scanner obj = new Scanner(System.in);
        System.out.printf("Please enter the number : ");
        int n = obj.nextInt();
        for(int i=1;i<=n;i++){
            has*=i;
        }
        System.out.printf("Facrorial of "+n+"!"+" = "+has);
    }
}
