package az.eolymp;

import java.util.*;

public class Problem4259 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        while (t-- != 0) {

            int n = sc.nextInt();

            if (n == 1) {
                int a = sc.nextInt();
                list.add(a);
            } else if (n == 3) {
                System.out.println(Collections.min(list));
            } else if (n == 2) {
                list.remove(list.size() - 1);
            }
        }
    }
}
