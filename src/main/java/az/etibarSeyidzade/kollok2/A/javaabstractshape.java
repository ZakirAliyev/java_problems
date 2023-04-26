package az.etibarSeyidzade.kollok2.A;

abstract class Shape {
    int a, b;

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int Perimeter();

    abstract double Area();
}

class Rectangle extends Shape {
    Rectangle(int a, int b) {
        super(a, b);
    }

    public int Perimeter() {
        return 2 * (a + b);
    }

    public double Area() {
        return a * b;
    }
}

class Square extends Rectangle {
    Square(int a) {
        super(a, a);
    }
}

class Triangle extends Shape {
    int c;

    Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int Perimeter() {
        return a + b + c;
    }

    public double Area() {
        double p = (double)(a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
