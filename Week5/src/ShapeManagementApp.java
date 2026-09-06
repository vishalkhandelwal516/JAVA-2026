abstract class Shape {

    private String color;

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    abstract double area();

    abstract double perimeter();

    @Override
    public String toString() {
        return String.format("%s [color=%s, area=%.2f, perimeter=%.2f]",
                getClass().getSimpleName(), color, area(), perimeter());
    }
}

class Circle extends Shape {

    private double radius;

    Circle(String color, double radius) {
        super(color);
        if (radius <= 0) {
            radius = 1.0;
        }
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        super(color);
        if (length <= 0) {
            length = 1.0;
        }
        if (width <= 0) {
            width = 1.0;
        }
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(String color, double sideA, double sideB, double sideC) {
        super(color);
        if (sideA <= 0 || sideB <= 0 || sideC <= 0
                || sideA + sideB <= sideC
                || sideA + sideC <= sideB
                || sideB + sideC <= sideA) {
            sideA = 1.0;
            sideB = 1.0;
            sideC = 1.0;
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    @Override
    double perimeter() {
        return sideA + sideB + sideC;
    }
}

