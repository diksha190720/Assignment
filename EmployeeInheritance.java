class Employee {
    // Attributes of the Employee class
    private String name;
    private int id;
    private double salary;

    // Constructor to initialize Employee attributes
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
    }
}

class Manager extends Employee {
    // Additional attribute for Manager
    private double bonus;

    // Constructor to initialize Manager attributes
    public Manager(String name, int id, double salary, double bonus) {
        // Call the constructor of the superclass (Employee)
        super(name, id, salary);
        this.bonus = bonus;
    }

    // Method to display manager details
    public void displayDetails() {
        // Call the displayDetails method of the superclass
        super.displayDetails();
        System.out.println("Manager Bonus: $" + bonus);
        System.out.println(); // Print a blank line for better readability
    }
}

public class EmployeeInheritance {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee1 = new Employee("Alice", 101, 50000);
        System.out.println("Employee Details:");
        employee1.displayDetails();

        // Creating a Manager object
        Manager manager1 = new Manager("Bob", 102, 80000, 5000);
        System.out.println("Manager Details:");
        manager1.displayDetails();
    }
}