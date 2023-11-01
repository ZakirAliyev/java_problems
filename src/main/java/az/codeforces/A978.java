package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(sc.nextInt());
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }
        }
        System.out.println(list1.size());
        for (int i = list1.size() - 1; i >= 0; i--) {
            System.out.print(list1.get(i) + " ");
        }
    }
}