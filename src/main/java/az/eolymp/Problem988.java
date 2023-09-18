package az.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem988 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int sum = 0, max = 0;

        for (int i = 1; i < n; i++) {
            if (list.get(i - 1) < list.get(i)) {
                sum++;
            } else {
                if (sum > max) {
                    max = sum;
                }
            }
        }
        if (sum > max) {
            max = sum;
        }
        System.out.println(max + 1);
    }
}
