package az.etibarSeyidzade.week13_1;

import java.util.*;

public class reqemlerebolunme {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        List<Character> list = new ArrayList<>();

        boolean brk = false;
        for (int i = 0; i < a.length(); i++) {
            if (!list.contains(a.charAt(i))) {
                list.add(a.charAt(i));
            }
            if (a.charAt(i) == '0') {
                brk = true;
            }
        }

        boolean flag = true;

        if (!brk) {
            int n = Integer.parseInt(a);

            for (Character elem : list) {
                int y = Integer.parseInt(String.valueOf(elem));
                if (n % y != 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (brk) {
            System.out.println("NO");
        } else {
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}