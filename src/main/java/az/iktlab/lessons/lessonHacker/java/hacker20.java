package az.iktlab.lessons.lessonHacker.java;

import java.util.*;

public class hacker20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int j = 0;
        int n = sc.nextInt();

        String[][] a = new String[n][3];

        for (int i = 0; i < n; i++) {
            a[i][j] = String.valueOf(sc.nextInt());
            a[i][j + 1] = sc.next();
            a[i][j + 2] = String.valueOf(sc.nextDouble());
        }


    }
}
