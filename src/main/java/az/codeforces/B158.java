package az.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class B158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            counts.add(0);
        }
        while (n-- > 0) {
            int s = scanner.nextInt();
            counts.set(s, counts.get(s) + 1);
        }
        int total = counts.get(4) + counts.get(3) + counts.get(2) / 2;
        counts.set(1, counts.get(1) - counts.get(3));
        if (counts.get(2) % 2 == 1) {
            total += 1;
            counts.set(1, counts.get(1) - 2);
        }
        if (counts.get(1) > 0) {
            total += (counts.get(1) + 3) / 4;
        }
        System.out.println(total);
    }
}
