package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A988 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (!list.contains(m)) {
                list.add(m);
                list1.add(i);
            }
            if (list1.size() == a) {
                break;
            }
        }
        if (list1.size() == a) {
            System.out.println("YES");
            for (int elem : list1) {
                System.out.print(elem + 1 + " ");
            }
        } else {
            System.out.println("NO");
        }
    }
}
