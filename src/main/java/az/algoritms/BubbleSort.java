package az.algoritms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort /* Asymptotic O(n^2)*/ {

    public static void main(String[] args) {

        int[] a = {88, 16, 3, 22, 4, 39, 1, 7, 15};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    System.out.println(Arrays.toString(a));
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
