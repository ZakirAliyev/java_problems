package az.eolymp;

import java.util.Scanner;

public class Problem1753 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            String binaryString = Integer.toBinaryString(n);
            StringBuilder b = new StringBuilder();
            for (int i = binaryString.length() - 1; i >= 0; i--) {
                if (binaryString.charAt(i) == '0') {
                    b.append("0");
                } else {
                    b.append("1");
                    break;
                }
            }
            int integ = Integer.parseInt(String.valueOf(b.reverse()), 2);
            System.out.println(integ);
        }
    }
}
