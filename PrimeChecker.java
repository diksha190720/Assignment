import java.util.Scanner;

public class PrimeChecker {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        
        // Read the integer input
        int number = scanner.nextInt();
        
        // Validate input
        if (number < 2) {
            System.out.println(number + " is not a prime number.");
        } else {
            // Check if the number is prime
            boolean isPrime = true; // Assume the number is prime initially
            
            // Check divisibility from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Found a divisor, so it's not prime
                    break; // No need to check further
                }
            }
            
            // Output the result
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        // Close the scanner
        scanner.close();
    }
   }

        		