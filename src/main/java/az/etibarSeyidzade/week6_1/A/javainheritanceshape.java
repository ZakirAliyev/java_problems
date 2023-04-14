package az.etibarSeyidzade.week6_1.A;

class Shape {
    private final String shapeName;

    Shape(String name) {
        shapeName = name;
    }

    public String getShapeName() {
        return shapeName;
    }

    public String toString() {
        return shapeName;
    }
}

class Circle extends Shape {
    Circle() {
        super("Circle");
    }
}

class Rectangle extends Shape {
    Rectangle() {
        super("Rectangle");
    }
}

class Triangle extends Shape {
    Triangle() {
        super("Triangle");
    }
}
