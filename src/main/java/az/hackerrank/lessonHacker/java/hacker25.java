package az.hackerrank.lessonHacker.java;

import java.util.Arrays;
import java.util.Scanner;

public class hacker25 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    public static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] chars1 = a.toCharArray();
        Arrays.sort(chars1);

        char[] chars2 = b.toCharArray();
        Arrays.sort(chars2);

        return Arrays.toString(chars1).equals(Arrays.toString(chars2));
    }
}
