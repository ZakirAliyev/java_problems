package az.codeforces;

import java.util.*;

public class B1042 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        List<Integer> ab = new ArrayList<>();
        List<Integer> bc = new ArrayList<>();
        List<Integer> ac = new ArrayList<>();
        List<Integer> abc = new ArrayList<>();

        while (t-- != 0) {
            int n = sc.nextInt();
            String str = sc.next();
            str = str.toLowerCase();
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            str = new String(charArray);
            if (str.equals("a")) {
                a.add(n);
            } else if (str.equals("b")) {
                b.add(n);
            } else if (str.equals("c")) {
                c.add(n);
            } else if (str.equals("ab")) {
                ab.add(n);
            } else if (str.equals("ac")) {
                ac.add(n);
            } else if (str.equals("bc")) {
                bc.add(n);
            } else if (str.equals("abc")) {
                abc.add(n);
            }
        }
        List<Integer> list = new ArrayList<>();
        if (!a.isEmpty() && !b.isEmpty() && !c.isEmpty()) {
            list.add(Collections.min(a) + Collections.min(b) + Collections.min(c));
        }
        if (!ab.isEmpty() && !c.isEmpty()) {
            list.add(Collections.min(ab) + Collections.min(c));
        }
        if (!ab.isEmpty() && !bc.isEmpty()) {
            list.add(Collections.min(ab) + Collections.min(bc));
        }
        if (!ab.isEmpty() && !ac.isEmpty()) {
            list.add(Collections.min(ab) + Collections.min(ac));
        }
        if (!bc.isEmpty() && !a.isEmpty()) {
            list.add(Collections.min(bc) + Collections.min(a));
        }
        if (!bc.isEmpty() && !ac.isEmpty()) {
            list.add(Collections.min(bc) + Collections.min(ac));
        }
        if (!ac.isEmpty() && !b.isEmpty()) {
            list.add(Collections.min(ac) + Collections.min(b));
        }
        if (!abc.isEmpty()) {
            list.add(Collections.min(abc));
        }

        try {
            System.out.println(Collections.min(list));
        } catch (Exception e) {
            System.out.println(-1);
        }
    }
}