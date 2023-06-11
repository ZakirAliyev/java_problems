package az.etibarSeyidzade.exam.arraySort;

import java.util.Arrays;
import java.util.Scanner;

public class mutkeqqQoymetiEn {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double [] a=new double[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            if(a[i]<0)
                a[i]*=-1;
        }
        Arrays.sort(a);
        System.out.printf("%.2f",a[n-1]);
    }
}
