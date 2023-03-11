package az.etibarSeyidzade.week3_3;

import java.util.Scanner;

public class necedefeolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0, m, h = n;
        while (h != 0) {
            while (n != 0) {
                m = n % 10;
                h -= m;
                n = n / 10;
            }
            sum++;
            n = h;
        }
        System.out.println(sum);
    }
}
