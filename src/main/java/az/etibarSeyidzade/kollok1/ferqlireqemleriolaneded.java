package az.etibarSeyidzade.kollok1;

import java.util.Scanner;

public class ferqlireqemleriolaneded {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        for(int i=a; i<=b; i++) {
            int i1=i/1000;
            int i2=i/100%10;
            int i3=i/10%10;
            int i4=i%10;

            if(i1!=i2 && i1!=i3 && i1!=i4 && i2!=i3 && i2!=i4 && i3!=i4) {
                System.out.print(i + " ");
            }
        }
    }
}

