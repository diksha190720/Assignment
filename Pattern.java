public class Pattern {

    public static void main(String[] args) {
        // Print the first pattern
        System.out.println("First Pattern:");
        printStarPattern(4);

        // Print the second pattern
        System.out.println("\nSecond Pattern:");
        printNumberPyramid(3);

        // Print the third pattern
        System.out.println("\nThird Pattern:");
        printDiamondPattern(3);
    }

    // Method to print the star pattern
    public static void printStarPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }

    // Method to print the number pyramid pattern
    public static void printNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
    }

    // Method to print the diamond pattern
    public static void printDiamondPattern(int rows) {
        // Upper part of the diamond
        for (int i = rows; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line
        }
    }
}