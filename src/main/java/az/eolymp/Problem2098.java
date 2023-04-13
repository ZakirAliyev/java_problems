package az.eolymp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2098 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();

        while (n-- != 0) {
            list.add(sc.nextInt());
        }

        for (int elem : list) {
            System.out.println(elem + " ");
        }
    }
}
