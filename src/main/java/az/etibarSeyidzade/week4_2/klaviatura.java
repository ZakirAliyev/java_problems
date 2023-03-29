package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class klaviatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            list1.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int is = i + 1;
            if (list1.stream().filter(b -> b == is).count() > list.get(i)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
