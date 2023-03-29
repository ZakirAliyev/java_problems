package az.etibarSeyidzade.week4_2;

import java.util.*;

public class ucebolunennomre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Double> a = new ArrayList<Double>();
        int say = 0;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            a.add(sc.nextDouble());
        }

        for (int i = 2; i < n; i += 3) {
            if (a.get(i) > 0) {
                sum += a.get(i);
                say += 1;
            }
        }

        System.out.print(say + " ");
        System.out.printf("%.2f", sum);
    }
}
