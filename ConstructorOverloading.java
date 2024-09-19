class Book {
    // Attributes of the Book class
    private String title;
    private String author;
    private double price;

    // Constructor with just the title
    public Book(String title) {
        this.title = title;
        this.author = "Unknown"; // Default author
        this.price = 0.0;        // Default price
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // Default price
    }

    // Constructor with all attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println(); // Print a blank line for better readability
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Creating a Book object with just the title
        Book book1 = new Book("To Kill a Mockingbird");
        System.out.println("Book 1 Details (Title Only):");
        book1.displayDetails();

        // Creating a Book object with title and author
        Book book2 = new Book("1984", "George Orwell");
        System.out.println("Book 2 Details (Title and Author):");
        book2.displayDetails();

        // Creating a Book object with all attributes
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        System.out.println("Book 3 Details (All Attributes):");
        book3.displayDetails();
    }
}