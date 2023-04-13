package az.etibarSeyidzade.week7_1.F.H;


import java.io.FileInputStream;
import java.io.IOException;

public class javafileinputstream {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("input.txt");
            int data;
            int sum = 0;
            while ((data = fileInputStream.read()) != -1) {
                if (data == '\n') {
                    sum -= 23;
                }
                sum += data;
            }
            System.out.println(sum);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
