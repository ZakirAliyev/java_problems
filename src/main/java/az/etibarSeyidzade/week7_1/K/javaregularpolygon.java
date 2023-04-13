package az.etibarSeyidzade.week7_1.K;

import java.util.Scanner;

interface RegularPolygon {
    int getNumSides();

    double getSideLength();

    static int totalSide(RegularPolygon[] rpArray) {
        int sum = 0;
        for (RegularPolygon elem : rpArray) {
            sum += elem.getNumSides();
        }
        return sum;
    }

    default double getPerimeter() {
        return getNumSides() * getSideLength();
    }

    default double getInteriorAngle() {
        return (getNumSides() - 2) * Math.PI / getNumSides();
    }
}

class EquilateralTriangle implements RegularPolygon {
    private double sideLength;

    public EquilateralTriangle(double sideLength) {

        this.sideLength = sideLength;
    }

    public int getNumSides() {
        return 3;
    }

    public double getSideLength() {
        return sideLength;
    }

    public String toString() {
        return "Triangle " + String.format("%.4f", getSideLength())
                + "\nPerimeter: " + String.format("%.4f", getPerimeter())
                + "\nInterior angle: " + String.format("%.4f", getInteriorAngle());
    }
}

class Square implements RegularPolygon {
    private double sideLength;

    public Square(double sideLength) {

        this.sideLength = sideLength;
    }

    public int getNumSides() {
        return 4;
    }

    public double getSideLength() {
        return sideLength;
    }

    public String toString() {
        return "Square " + String.format("%.4f", getSideLength())
                + "\nPerimeter: " + String.format("%.4f", getPerimeter())
                + "\nInterior angle: " + String.format("%.4f", getInteriorAngle());
    }
}

public class javaregularpolygon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RegularPolygon[] rpArray = new RegularPolygon[n];
        String a;
        double m;
        for (int i = 0; i < n; i++) {
            a = sc.next();
            m = sc.nextDouble();
            if (a.equals("Triangle")) {
                EquilateralTriangle triangle = new EquilateralTriangle(m);
                rpArray[i] = triangle;
                System.out.println(triangle.toString());
            } else {
                Square square = new Square(m);
                rpArray[i] = square;
                System.out.println(square.toString());
            }
        }
        System.out.println("Total sides: " + RegularPolygon.totalSide(rpArray));
        sc.close();
    }
}