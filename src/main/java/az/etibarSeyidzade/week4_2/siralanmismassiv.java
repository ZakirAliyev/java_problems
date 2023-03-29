package az.etibarSeyidzade.week4_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class siralanmismassiv {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (!list.contains(t)) {
                list.add(t);
            }
        }

        for (int a : list) {
            System.out.print(a + " ");
        }
    }
}
