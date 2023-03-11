package az.hackerrank.lessonHacker.java;

import java.util.*;

public class hacker30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Long> map = new HashMap<>();

        long n = sc.nextLong();
        sc.nextLine();

        for (long i = 0; i < n; i++) {
            String key = sc.nextLine();
            long value = sc.nextLong();
            map.put(key, value);
            sc.nextLine();
        }

        for (long i = 0; i < n; i++) {
            try {
                String name = sc.nextLine();
                long number = map.get(name);
                System.out.println(name + "=" + number);
            } catch (Exception e) {
                System.out.println("Not found");
            }
        }
    }
}
