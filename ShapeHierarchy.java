abstract class Shape {
    // Abstract method for calculating area
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override the area method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangles extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangles(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override the area method to calculate the area of the rectangle
    @Override
    public double area() {
        return length * width;
    }
}

class Square extends Shape {
    private double side;

    // Constructor to initialize the side length
    public Square(double side) {
        this.side = side;
    }

    // Override the area method to calculate the area of the square
    @Override
    public double area() {
        return side * side;
    }
}

public class ShapeHierarchy {
    public static void main(String[] args) {
        // Creating instances of different shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangles(4.0, 6.0);
        Shape square = new Square(3.0);

        // Displaying the area of each shape
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Square: " + square.area());
    }
}
