package az.codeforces;

import java.util.*;

public class A1682 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            List<Character> list = new ArrayList<>();
            String a = sc.next();
            for (int i = 0; i < a.length(); i++) {
                list.add(a.charAt(i));
            }
            Set<Character> set1 = new HashSet<>(list);
            if (set1.size() == 1) {
                System.out.println(list.size());
            } else {
                while (true) {
                    if (!list.isEmpty()) {
                        list.remove(0);
                        if (!list.isEmpty()) {
                            list.remove(list.size() - 1);
                        }
                    }
                    Set<Character> set = new HashSet<>(list);
                    if (set.isEmpty()) {
                        System.out.println(a.length());
                        break;
                    } else if (set.size() == 1) {
                        System.out.println(list.size());
                        break;
                    }
                }
            }
        }
    }
}
