package az.iktlab.lessons.lessonHacker;

import java.util.*;

public class hacker10 {

    public static void main(String[] args) {

        int month = 1, day = 3, year = 1;
        System.out.println(findDay(month,day,year));
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int k = calendar.get(Calendar.DAY_OF_WEEK);
        switch (k) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            case 7:
                return "SATURDAY";
            default:
                return "";
        }

    }
}
