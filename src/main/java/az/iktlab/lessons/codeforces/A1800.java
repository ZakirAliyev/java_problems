package az.iktlab.lessons.codeforces;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class A1800 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {

            int n = sc.nextInt();
            String a = sc.next();
            a = a.toLowerCase();

            Set<Character> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(a.charAt(i));
            }

            Iterator<Character> iterator = set.iterator();
            String b = "";
            for (int i = 0; i < set.size(); i++) {

                Character firstElement = iterator.next();
                b += firstElement.toString();
            }

            if (b.equals("ewmo")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
