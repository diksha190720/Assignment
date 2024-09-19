class Student {
    // Attributes of the Student class
    private String name;
    private int age;
    private char grade;

    // Constructor to initialize the student details
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display the student's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println(); // Print a blank line for better readability
    }
}

public class StudentDetails {

    public static void main(String[] args) {
        // Create multiple Student objects
        Student student1 = new Student("Alice", 20, 'A');
        Student student2 = new Student("Bob", 22, 'B');
        Student student3 = new Student("Charlie", 21, 'A');

        // Display the details of each student
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
