package az.iktlab.lessons.lesson13;

import java.util.ArrayList;

public class pellSeries {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Integer a = 1, b = 0, c = null;
        for (int i = 0; i < 15; i++) {

            list.add(b);
            c = b;
            b = b * 2 + a;
            a = c;
        }
        System.out.println(list);
    }
}
