package az.etibarSeyidzade.week2_2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class nikolayucunzaman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String time1 = sc.next();
        LocalTime t1 = LocalTime.parse(time1, DateTimeFormatter.ofPattern("HH:mm:ss"));

        // İkinci vaxti təyin edin
        String time2 = sc.next();
        LocalTime t2 = LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH:mm:ss"));

        // Fərqin hesablanması
        long seconds = t1.until(t2, ChronoUnit.SECONDS);

        if (Math.abs(seconds) > 12 * 60 * 60) {
            seconds -= 24 * 60 * 60;
        }

        int h = (int) (Math.abs(seconds / 3600));
        int m = (int) (Math.abs((seconds % 3600) / 60));
        int s = (int) (Math.abs(seconds % 60));

        // Formatı təyin edin və fərqi konsola yazın
        String diff = String.format("%02d:%02d:%02d", h, m, s);
        System.out.println(diff);
    }
}
