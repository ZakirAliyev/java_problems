package az.codeforces.div3_867;

import java.util.*;

public class B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long t = sc.nextInt();

        while (t-- != 0) {
            long n = sc.nextInt();
            List<Long> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextLong());
            }
            Collections.sort(list);
            if (list.size()<3) {
                System.out.println(list.get(0) * list.get(1));
            } else {
                System.out.println(Math.max(list.get(0) * list.get(1),
                        list.get(list.size() - 1) * list.get(list.size() - 2)));
            }
        }
    }
}
