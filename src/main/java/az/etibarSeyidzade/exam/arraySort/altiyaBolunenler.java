package az.etibarSeyidzade.exam.arraySort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class altiyaBolunenler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int cem = 0;
        int say = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > 0 && a.get(i) % 6 == 0) {
                say++;
                cem += a.get(i);
            }
        }

        System.out.println(say + " " + cem);
    }
}