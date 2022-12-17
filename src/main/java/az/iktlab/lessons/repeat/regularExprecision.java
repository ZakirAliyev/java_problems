package az.iktlab.lessons.repeat;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExprecision {

    public static void main(String[] args) {

        Pattern pattern= Pattern.compile("zakir",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Zakir gozel insan");

        System.out.println(matcher.find());

        String a = "Zakir gozel insan";

        a = Arrays.toString(a.split(" "));
        System.out.println();
    }
}
