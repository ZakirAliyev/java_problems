package az.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8995 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();

        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            list1.add(a.charAt(i));
        }

        for (int i = 0; i < a.length(); i++) {
            int sum = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    sum++;
                }
            }
            if (sum > 1 && !list3.contains(a.charAt(i))) {
                list3.add(a.charAt(i));
            }
        }

        for (int i = 0; i < a.length(); i++) {
            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i));
            }
        }

        if (list1.size() == list2.size()) {
            System.out.println("NO");
        } else {
            for (char elem : list3) {
                System.out.print(elem);
            }
        }
    }
}
