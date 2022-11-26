package az.iktlab.lessons.lesson6;

import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        while(true){
            System.out.printf("Please enter the positive number : ");
            int n = obj.nextInt();
            if(n>0){
                for(int i=1;i<=10;i++){
                    System.out.println(i+"*"+n+"="+(i*n));
                }
                break;
            }
        }
    }
}
