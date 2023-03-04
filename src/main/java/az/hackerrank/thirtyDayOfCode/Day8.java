package az.hackerrank.thirtyDayOfCode;

import java.util.*;

public class Day8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Long> map = new HashMap<>();

        long n = sc.nextInt();

        for (long i = 0; i < n; i++) {
            String key = sc.next();
            Long value = sc.nextLong();
            map.put(key, value);
        }

        for (long i = 0; i < n; i++) {

            try {
                String name = sc.next();
                Long number = map.get(name);

                if (number == null) {
                    System.out.println("Not found");
                } else {
                    System.out.println(name + "=" + number);
                }
            } catch (Exception e) {
                System.out.println();
            }
        }
    }
}
