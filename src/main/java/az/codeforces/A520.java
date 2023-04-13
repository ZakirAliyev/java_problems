package az.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A520 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        a = a.toLowerCase();

        Set<Character> charList = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {
            charList.add(a.charAt(i));
        }

        if (charList.size() == 26) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
