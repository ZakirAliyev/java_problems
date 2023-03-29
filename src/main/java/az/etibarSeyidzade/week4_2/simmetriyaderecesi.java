package az.etibarSeyidzade.week4_2;

import java.util.Scanner;

public class simmetriyaderecesi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int sum = 0, i = 0, j = a.length() - 1;

        while (i <= j) {
            if (a.charAt(i) == a.charAt(j)) {
                sum++;
            }
            i++;
            j--;
        }

        System.out.println(sum);
    }
}
