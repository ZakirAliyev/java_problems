package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ikienboluk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        System.out.println(list.get(n - 1) + list.get(n - 2));
    }
}
