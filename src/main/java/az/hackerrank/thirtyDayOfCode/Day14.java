package az.hackerrank.thirtyDayOfCode;

import java.util.*;


class Difference {
    private final int[] elements;
    public int maximumDifference;


    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length - 1] - elements[0];
    }


} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
