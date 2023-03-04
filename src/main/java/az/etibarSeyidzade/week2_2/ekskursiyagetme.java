package az.etibarSeyidzade.week2_2;

import java.util.Scanner;

public class ekskursiyagetme {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        double k = sc.nextDouble();
        int sum = 0;
        double oglan_otagi, qiz_otagi;
        int oglan_otagi_1, qiz_otagi_1;
        oglan_otagi = n / k;
        oglan_otagi_1 = (int) (oglan_otagi / 1);
        if (oglan_otagi == oglan_otagi_1) {
            sum += oglan_otagi_1;
        } else {
            oglan_otagi_1++;
            sum += oglan_otagi_1;
        }
        sum = sum;
        qiz_otagi = m / k;
        qiz_otagi_1 = (int) (qiz_otagi / 1);
        if (qiz_otagi == qiz_otagi_1) {
            sum += qiz_otagi_1;
        } else {
            qiz_otagi_1++;
            sum += qiz_otagi_1;
        }
        System.out.println(sum);
    }
}
