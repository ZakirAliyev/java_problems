package az.etibarSeyidzade.exam.arraySort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sifirlariSurusdur {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt(), sum = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t == 0) {
                sum++;
            } else {
                System.out.print(t + " ");
            }
            list.add(t);
        }

        for (int i = 0; i < sum; i++) {
            System.out.print(0 + " ");
        }
    }
}