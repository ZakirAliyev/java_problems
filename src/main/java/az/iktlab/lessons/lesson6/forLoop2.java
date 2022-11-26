package az.iktlab.lessons.lesson6;

public class forLoop2 {

    public static void main(String[] args) {

        int a, b, c, d;
        for (int i = 1000; i < 10000; i++) {
            a = i / 1000;
            b = i / 100 % 10;
            c = i / 10 % 10;
            d = i % 10;
            if (a + b == c + d) System.out.println(i);
        }
    }
}
