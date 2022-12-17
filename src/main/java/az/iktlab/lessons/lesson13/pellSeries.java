package az.iktlab.lessons.lesson13;

import java.util.ArrayList;
import java.util.List;

public class pellSeries {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(List.of(0, 1));

        for (int i = 2; i < 15; i++) {

            list.add(i, list.get(i - 2) + list.get(i - 1) * 2);
        }
        System.out.println(list);
    }
}
