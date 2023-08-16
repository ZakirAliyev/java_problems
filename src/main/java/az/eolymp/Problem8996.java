package az.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem8996 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            list1.add(a.charAt(i));
        }
        for (int i = 0; i < a.length(); i++) {
            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i));
            }
        }
        for (char elem : list2) {
            System.out.print(elem);
        }
    }
}
