package az.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8970 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < n / 2; i++) {
            System.out.print(list.get(i) + " " + list.get(i + n / 2 + 1) + " ");
        }

        if (n / 2 != 0) {
            System.out.print(list.get(n / 2 + 1));
        }
    }
}
