package az.iktlab.lessons.lessonHacker.problemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hacker1 {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
