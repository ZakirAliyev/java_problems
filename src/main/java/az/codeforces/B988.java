package az.codeforces;

import java.util.*;

public class B988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> list = new ArrayList<>();
        while (n-- != 0) {
            list.add(sc.next());
        }
        boolean flag = true;
        list.sort(Comparator.comparing(String::length));
        for (int i = list.size() - 1; i > 0; i--) {
            if (!list.get(i).contains(list.get(i - 1))) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
            for (String elem : list) {
                System.out.println(elem);
            }
        } else {
            System.out.println("NO");
        }
    }
}
