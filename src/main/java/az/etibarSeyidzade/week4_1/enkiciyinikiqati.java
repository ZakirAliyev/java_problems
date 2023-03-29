package az.etibarSeyidzade.week4_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class enkiciyinikiqati {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Double> list = new ArrayList<>();
        double n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextDouble());
        }

        double min = Collections.min(list);

        System.out.println(String.format("%.2f", min * 2));
    }
}
