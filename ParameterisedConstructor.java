class Car {
    // Attributes of the Car class
    private String brand;
    private String model;
    private double price;

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println(); // Print a blank line for better readability
    }
}

public class ParameterisedConstructor {
    public static void main(String[] args) {
        // Creating a Car object using the default constructor
        Car car1 = new Car();
        System.out.println("Car 1 Details (Default Constructor):");
        car1.displayDetails();

        // Creating a Car object using the parameterized constructor
        Car car2 = new Car("Toyota", "Camry", 24000.00);
        System.out.println("Car 2 Details (Parameterized Constructor):");
        car2.displayDetails();

        // Creating another Car object using the parameterized constructor
        Car car3 = new Car("Honda", "Accord", 26000.00);
        System.out.println("Car 3 Details (Parameterized Constructor):");
        car3.displayDetails();
    }
}