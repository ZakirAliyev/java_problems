package az.ypb2.setirlerVeDovrler;

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        if (a.charAt(0) == '-') {
            System.out.println(a.charAt(2));
        } else {
            System.out.println(a.charAt(1));
        }
    }
}
