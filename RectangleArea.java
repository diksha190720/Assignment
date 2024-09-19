// Rectangle class
class Rectangle {
    // Attributes of the Rectangle class
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display the rectangle's dimensions
    public void displayDimensions() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

// Main class to test Rectangle
public class RectangleArea {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Display rectangle dimensions
        rectangle.displayDimensions();

        // Calculate and display the area of the rectangle
        double area = rectangle.calculateArea();
        System.out.println("Area of the rectangle: " + area);

        // Calculate and display the perimeter of the rectangle
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
