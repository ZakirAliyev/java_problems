package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class erimek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, say = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (list.get(i) > 0) {
                say++;
            } else {
                say = 0;
            }
            if (say > max) {
                max = say;
            }
        }
        System.out.println(max);
    }
}