import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        
        // Read the integer input
        int number = scanner.nextInt();
        
        // Call the method to calculate the factorial
        long factorial = calculateFactorial(number);
        
        // Output the result
        System.out.println("The factorial of " + number + " is: " + factorial);
        
        // Close the scanner
        scanner.close();
    }

    // Method to calculate the factorial of a given number
    public static long calculateFactorial(int number) {
        // Initialize result
        long result = 1;
        
        // Check if the number is negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Return -1 to indicate an error
 }
        
        // Calculate factorial using a while loop
        int count = 1;
        while (count <= number) {
            result *= count; // Multiply result by count
            count++; // Increment count
        }
        
        return result; // Return the calculated factorial
    }
}