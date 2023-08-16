package az.eolymp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem8998 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Character> list = new ArrayList<>();

        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            list.add(a.charAt(i));
        }

        Collections.sort(list);

        int sum = 0;
        for (char elem : list) {
            if (list.get(0).equals(elem)) {
                sum++;
            }
        }
        System.out.print(list.get(0) + " " + sum);
    }
}
