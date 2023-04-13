package az.etibarSeyidzade.week7_1.J;

import java.text.DecimalFormat;
import java.util.Scanner;

interface GeometricObject {
    double getParameter();

    double getArea();
}

class Circle implements GeometricObject {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getParameter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

interface Resizable {
    public void resize(double percent);
}

class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    public void resize(double percent) {
        radius *= percent / 100.0;
    }
}

public class javageometricobject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ResizableCircle circle = new ResizableCircle(1);
        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        while (sc.hasNext()) {
            String a = sc.next();
            switch (a) {
                case "Area":
                    System.out.println(decimalFormat.format(circle.getArea()));
                    break;
                case "Perimeter":
                    System.out.println(decimalFormat.format(circle.getParameter()));
                    break;
                case "Resize":
                    double percent = sc.nextDouble();
                    circle.resize(percent);
                    break;
            }
        }
    }
}
