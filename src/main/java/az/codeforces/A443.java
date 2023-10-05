package az.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A443 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        Set<Character> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(a.charAt(i))) {
                set.add(a.charAt(i));
            }
        }
        System.out.println(set.size());
    }
}
