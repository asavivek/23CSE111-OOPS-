abstract class Shape {
    // Abstract method (must be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method (default implementation)
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double s) {
        side = s;
    }

    double calculateArea() {
        return side * side;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        circle.display();
    }
}