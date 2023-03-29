package az.etibarSeyidzade.week4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class enboyukveenkiciyievezlemek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int min = Collections.min(list);
        int max = Collections.max(list);

        for (int i = 0; i < n; i++) {
            if (list.get(i) == min) {
                System.out.print(max + " ");
            } else if (list.get(i) == max) {
                System.out.print(min + " ");
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
