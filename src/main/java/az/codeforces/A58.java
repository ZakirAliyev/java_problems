package az.codeforces;

import java.util.*;

public class A58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String a = sc.next();
        StringBuilder b = new StringBuilder();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            if (b.toString().equals("hell") && a.charAt(i) == 'o') {
                b.append('o');
            } else if (b.toString().equals("hel") && a.charAt(i) == 'l') {
                b.append('l');
            } else if (b.toString().equals("he") && a.charAt(i) == 'l') {
                b.append('l');
            } else if (b.toString().equals("h") && a.charAt(i) == 'e') {
                b.append('e');
            } else if (b.toString().isEmpty() && a.charAt(i) == 'h') {
                b.append('h');
            }
        }
        if (b.toString().equals("hello")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
