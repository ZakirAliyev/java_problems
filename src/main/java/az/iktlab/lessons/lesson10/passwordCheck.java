package az.iktlab.lessons.lesson10;

import java.util.Scanner;

public class passwordCheck {

    public static void main(String[] args) {

        String a;
        boolean flag = true;
        System.out.println(findPassword(flag));
    }

    public static boolean findPassword(boolean flag) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.length() < 10 || a == a.toLowerCase())
            flag = false;
        int sum = 0, sum1 = 0;
        for (int i = '!'; i < '@'; i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == i && a.charAt(j) != '1' && a.charAt(j) != '2'
                        && a.charAt(j) != '3' && a.charAt(j) != '4' && a.charAt(j) != '5'
                        && a.charAt(j) != '6' && a.charAt(j) != '7' && a.charAt(j) != '8'
                        && a.charAt(j) != '9' && a.charAt(j) != '0') {
                    sum++;
                }
            }
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1' || a.charAt(i) == '2'
                    || a.charAt(i) == '3' || a.charAt(i) == '4' || a.charAt(i) == '5'
                    || a.charAt(i) == '6' || a.charAt(i) == '7' || a.charAt(i) == '8'
                    || a.charAt(i) == '9' || a.charAt(i) == '0') {
                sum1++;
            }
        }
        if (sum > 0 || sum1 < 2) flag = false;
        return flag;
    }

}
