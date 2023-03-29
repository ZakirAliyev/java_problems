package az.etibarSeyidzade.week4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class elementlerisurusdur {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print(list.get(n - 1));

        for (int i = 0; i < n - 1; i++) {
            System.out.print(" " + list.get(i));
        }
    }
}
