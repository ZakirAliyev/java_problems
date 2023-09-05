package az.eolymp.adaDay1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class I {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n * 2; i++) {
            list.add(sc.nextInt());
        }

    }
}
