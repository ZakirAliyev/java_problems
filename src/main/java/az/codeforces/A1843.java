package az.codeforces;

import java.util.*;

public class A1843 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            int i = 0, j = list.size() - 1, sum = 0;
            Collections.sort(list);
            for (int z = 0; z < n / 2; z++) {
                sum += list.get(i) - list.get(j);
                i++;
                j--;
            }
            System.out.println(Math.abs(sum));
        }
    }
}
