package az.iktlab.lessons.lesson12;

public class findPassword2 {

    public static boolean findPass(String a) {

        int sum = 0, sum1 = 0;
        a = a.toLowerCase();
        if (a.length() > 9) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) <= '9' && a.charAt(i) >= '0')
                    sum++;
            }
            if (sum > 1) {
                for (int i = 0; i < a.length(); i++) {
                    if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
                            || (a.charAt(i) >= '0' && a.charAt(i) <= '9')) {
                        sum1++;
                    }
                }
                if(sum1==a.length()) return true;
                else return false;
            } else return false;
        } else return false;
    }
}
