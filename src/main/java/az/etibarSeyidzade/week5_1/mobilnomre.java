package az.etibarSeyidzade.week5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mobilnomre {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for (char i = 48; i < 58; i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == i && a.charAt(j) != ' ') {
                    count++;
                }
            }
            if (count == 0) {
                list.add(i - 48);
            }
            count = 0;
        }
        System.out.println(list.size());
        for (int elem : list) {
            System.out.print(elem + " ");
        }
    }
}