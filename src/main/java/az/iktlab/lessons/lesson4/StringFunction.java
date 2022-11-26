package az.iktlab.lessons.lesson4;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringFunction {

    public static void main(String[] args) {

        String a = "ABCDE";
        String b = "XYZMN";

        System.out.println(a.indexOf('A'));                      //  index of char
        System.out.println(a.length());                          //  find string size
        System.out.println(a.getBytes(StandardCharsets.UTF_8));  //  convert to symbol
        System.out.println(a.getBytes());                        //  convert to symbol
        System.out.println(a.toLowerCase());                     //  every letter are lower
        System.out.println(a.toUpperCase());                     //  every letter are upper
        System.out.println(a.charAt(3));                         //  print n-th letter
        System.out.println(a.chars());                           //
        System.out.println(a.codePointAt(4));              //  print n-th letter's ASCII code
        System.out.println(a.codePointBefore(3));          //  print (n-1)-th letter's ASCII code
        System.out.println(a.codePointCount(0, 4));              //  count(int,int) ASCII
        System.out.println(b.compareTo(a));                      //  compare strings for UNICODE
        System.out.println(b.compareToIgnoreCase(a));            //  compare strings for UNICODE
        System.out.println(a.concat(b));                         //  connect strings
        System.out.println(a.contains(b));                       //  if b in a print(true) else print(false)
        System.out.println(a.contentEquals(b));                  //  if a==b print(true) else print(false)
        System.out.println(a.endsWith(b));                       //  a[n-1]==b print(true) else print(false)
        System.out.println(a.repeat(5));                   //  repeat string for n time
        char c[] = a.toCharArray();
        for (int i = 0; i < a.length(); i++)
            System.out.println(c[i]);                            //  create array from string
        System.out.println(a.replace('A', 'Z'));  //  replace(char,char)
        System.out.println(a.trim());                            //  cut begin and end spaces
    }
}
