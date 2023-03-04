package az.etibarSeyidzade.week2_1;

import java.util.Scanner;

public class ucreqemliededinreqemlerineayrilmasi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if(a.charAt(0)=='-') {
            for (int i = 1; i < a.length(); i++) {
                System.out.println(a.charAt(i));
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.charAt(i));
            }
        }
    }
}
