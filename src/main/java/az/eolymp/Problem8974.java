package az.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8974 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> list1 = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            list1.add(list.get(i));
        }

        List<Integer> list2 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        boolean flag1 = false;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            boolean flag = true;
            for (int j = i; j < n; j++) {
                if (list1.get(i).equals(list1.get(j))) {
                    sum++;
                }
                if (sum > 1) {
                    flag1 = true;
                    if (list2.contains(list1.get(i))) {
                        flag = false;
                    }

                    list2.add(list1.get(i));
                    if (flag) {
                        list4.add(list1.get(i));
                    }
                    break;
                }
            }
        }

        if (flag1) {
            for (int i = list4.size() - 1; i >= 0; i--) {
                System.out.print(list4.get(i) + " ");
            }
        } else {
            System.out.println("NO");
        }
    }
}
