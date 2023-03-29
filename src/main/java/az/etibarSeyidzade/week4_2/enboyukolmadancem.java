package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class enboyukolmadancem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = Collections.max(list), sum = 0;

        for (int a : list) {
            if (a != max) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}
