package az.hackerrank.lessonHacker.java;

import java.util.Scanner;

public class hacker8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            try {
                long elem = sc.nextLong();
                if(elem<=Math.pow(2,7)-1 && elem>=-Math.pow(2,7)) {
                    System.out.println(elem + " can be fitted in:");
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if(elem<=Math.pow(2,15)-1 && elem>=-Math.pow(2,15)) {
                    System.out.println(elem + " can be fitted in:");
                    System.out.println("* short\n* int\n* long");
                }
                else if(elem<=Math.pow(2,31)-1 && elem>=-Math.pow(2,31)) {
                    System.out.println(elem + " can be fitted in:");
                    System.out.println("* int\n* long");
                }
                else if(elem<=Math.pow(2,63)-1 && elem>=-Math.pow(2,63)) {
                    System.out.println(elem + " can be fitted in:");
                    System.out.println("* long");
                }
            }
            catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
