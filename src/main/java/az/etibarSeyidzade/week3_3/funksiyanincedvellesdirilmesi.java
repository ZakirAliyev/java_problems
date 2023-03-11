package az.etibarSeyidzade.week3_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class funksiyanincedvellesdirilmesi {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double t = a;
        while (t <= b) {
            DecimalFormat decimalFormat = new DecimalFormat("#.000");
            System.out.print(decimalFormat.format(t));
            System.out.print(" ");
            double z = 3 * Math.sin(t);
            System.out.println(decimalFormat.format(z));
            t += h;
        }
    }
}
