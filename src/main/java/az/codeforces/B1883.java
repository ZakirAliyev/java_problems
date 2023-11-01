package az.codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1883 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            String str = sc.next();
            int sum = 0;
            List<Character> list = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (!list.contains(str.charAt(i))) {
                    list.add((str.charAt(i)));
                }
            }
            for (int i = 0; i < list.size(); i++) {
                int say = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == list.get(i)) {
                        say++;
                    }
                }
                if (say % 2 != 0) {
                    sum++;
                }
            }
            if (b >= sum - 1)
                System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
