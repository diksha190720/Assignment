

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
    	LeapYear leap =new LeapYear();
        // Create a Scanner object for reading input from the user
        Scanner scanner = new Scanner(System.in);
        
        // ask the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();  // Read the input year
        
        scanner.close(); 
        // Close the Scanner object
        leap.check(year);
        
        
       
    }
}
//using different class
class LeapYear {

    public void check(int year) {
    	 // Check if the year is a leap year using if-else statements
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
        {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}