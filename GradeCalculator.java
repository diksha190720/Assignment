import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a score
        System.out.print("Enter the score (0-100): ");
        
        // Read the score input
        int score = scanner.nextInt();
        
        // Call the method to get the letter grade
        char grade = calculateGrade(score);
        
        // Output the grade
        if (grade != ' ') {
            System.out.println("The grade is: " + grade);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the letter grade based on the score
    public static char calculateGrade(int score) {
        char grade;
        
        // Determine the letter grade based on the score
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            return ' '; // Return a space character for invalid input
        }
        
        return grade; // Return the determined grade
    }
}