import java.util.Scanner;

public class FibonacciGenerator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        
        // Read the integer input
        int limit = scanner.nextInt();
        
        // Call the method to generate the Fibonacci sequence
        generateFibonacci(limit);
        
        // Close the scanner
        scanner.close();
    }

    // Method to generate and print the Fibonacci sequence up to a given limit
    public static void generateFibonacci(int limit) {
        int a = 0, b = 1;
        
        // Print Fibonacci numbers until the limit is reached
        System.out.println("Fibonacci sequence up to " + limit + ":");
        while (a <= limit) {
            System.out.print(a + " ");
            // Update values
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); // Move to the next line after printing the sequence
    }
}
