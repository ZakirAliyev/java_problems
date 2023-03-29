package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class avtomat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        double average = list.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
        System.out.println(list.stream().filter(a -> a > average).count());
    }
}
