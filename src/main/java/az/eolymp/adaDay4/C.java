package az.eolymp.adaDay4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- != 0) {
            List<Integer> list = new ArrayList<>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(sc.next() + sc.next()));
            }
            boolean flag = true;
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(i).equals(list.get(j))) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("impossible");
                    break;
                }
            }
            if (flag) {
                System.out.println("possible");
            }
        }
    }
}
