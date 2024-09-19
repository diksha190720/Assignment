
//copy constructor
class Point {
    // Attributes of the Point class
    private int x;
    private int y;

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }

    // Method to display the coordinates of the point
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        // Creating a Point object using the parameterized constructor
        Point point1 = new Point(5, 10);
        System.out.println("Original Point:");
        point1.display();

        // Creating another Point object using the copy constructor
        Point point2 = new Point(point1);
        System.out.println("Copied Point:");
        point2.display();
    }
}