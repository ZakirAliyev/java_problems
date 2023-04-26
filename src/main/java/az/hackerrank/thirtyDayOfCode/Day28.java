package az.hackerrank.thirtyDayOfCode;

import java.util.*;

public class Day28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();

            if (b.charAt(b.length() - 1) == 'm'
                    && b.charAt(b.length() - 2) == 'o'
                    && b.charAt(b.length() - 3) == 'c'
                    && b.charAt(b.length() - 4) == '.'
                    && b.charAt(b.length() - 5) == 'l'
                    && b.charAt(b.length() - 6) == 'i'
                    && b.charAt(b.length() - 7) == 'a'
                    && b.charAt(b.length() - 8) == 'm'
                    && b.charAt(b.length() - 9) == 'g'
                    && b.charAt(b.length() - 10) == '@') {
                list.add(a);
            }
        }
        Collections.sort(list);

        for (String elem : list) {
            System.out.println(elem);
        }
    }
}
