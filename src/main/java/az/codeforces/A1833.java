package az.codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A1833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            String s = sc.next();
            Set<String> set = new HashSet<>();
            for (int i = 0; i < s.length() - 1; i++) {
                set.add(s.substring(i, i + 2));
            }
            System.out.println(set.size());
        }
    }
}
