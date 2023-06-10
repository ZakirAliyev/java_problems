package az.etibarSeyidzade.exam.stringFunction;

import java.util.Scanner;

public class cumlelerinSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int say = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                say++;
            }
        }
        System.out.println(say);
    }
}
