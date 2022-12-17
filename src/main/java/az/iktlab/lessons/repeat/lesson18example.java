package az.iktlab.lessons.repeat;

import java.util.ArrayList;
import java.util.Random;

public class lesson18example {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 10_000_000; i++) {
            list.add(random.nextInt(151));
        }

        for (int i = 1; i <= 150; i++) {
            for (int j = 0; j < 10_000_000; j++) {
                if (list.get(j).equals(i)) {
                    sum++;
                }
            }
            System.out.println(i + " --> " + sum);
            sum = 0;
        }
    }
}
