package az.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A58 {

    public static void main(String[] args) {


        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        a = a.toLowerCase();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'h' || a.charAt(i) == 'e' || a.charAt(i) == 'l' || a.charAt(i) == 'o') {
                set.add(String.valueOf(a.charAt(i)));
            }
            if (a.charAt(i) == 'l')
                sum++;
        }

        if (set.size() == 4 && sum > 1 && a.length() > 5)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
