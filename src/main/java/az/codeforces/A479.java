package az.codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A479 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        list.add(a + b * c);
        list.add((a + b) * c);

        list.add(a * b + c);
        list.add(a * (b + c));

        list.add(a * b * c);
        list.add(a + b + c);

        System.out.println(Collections.max(list));
    }
}
