package az.eolymp;

import java.util.*;

public class Problem8623 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            list.add(a.charAt(i));
        }

        Comparator<Character> tersSiralayici = Collections.reverseOrder();
        list.sort(tersSiralayici);

        String b = "";

        for (int i = 0; i < a.length(); i++) {
            b += list.get(i);
        }

        System.out.println((int)Math.pow(Integer.parseInt(b),2));
    }
}
