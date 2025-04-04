public class AreaCalculator {
    
    // Calculate area of a square
    public double calculateArea(double side) {
        return side * side;
    }
    
    // Calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Calculate area of a circle
    public double calculateArea(double radius, String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return Math.PI * radius * radius;
        }
        return 0;
    }
    
    // Calculate area of a triangle
    public double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        }
        return 0;
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        System.out.println("Area of square (side 5): " + calculator.calculateArea(5));
        System.out.println("Area of rectangle (6x4): " + calculator.calculateArea(6, 4));
        System.out.println("Area of circle (radius 3): " + calculator.calculateArea(3, "circle"));
        System.out.println("Area of triangle (base 4, height 7): " + 
                          calculator.calculateArea(4, 7, "triangle"));
    }
}