// File: GeometryPackageDemo.java

// Package declaration
package geometry;

// Circle class in geometry package
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayInfo() {
        System.out.println("Circle with radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }
}

// Rectangle class in geometry package
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void displayInfo() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}

// ShapeCalculator utility class in geometry package
class ShapeCalculator {
    public static void printCircleDetails(double radius) {
        Circle circle = new Circle(radius);
        circle.displayInfo();
    }

    public static void printRectangleDetails(double length, double width) {
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.displayInfo();
    }
}

// Main class to demonstrate the package (outside the geometry package)
public class GeometryPackageDemo {
    public static void main(String[] args) {
        // Using the geometry package classes
        System.out.println("=== Geometry Package Demo ===");
        
        // Method 1: Using fully qualified names
        geometry.Circle myCircle = new geometry.Circle(5.0);
        myCircle.displayInfo();

        // Method 2: Using import (not needed since we're in same file)
        Rectangle myRectangle = new Rectangle(4.0, 6.0);
        myRectangle.displayInfo();

        // Using the ShapeCalculator utility
        System.out.println("\nUsing ShapeCalculator:");
        ShapeCalculator.printCircleDetails(3.0);
        ShapeCalculator.printRectangleDetails(5.0, 7.0);
    }
}