// BankAccount class
class BankAccount {
    // Attributes of the BankAccount class
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize a bank account
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal");
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Method to display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

// Main class to test BankAccount
public class displayAccountDetails {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account1 = new BankAccount("123456789", "John Doe", 1000.00);

        // Display account details
        account1.displayAccountInfo();

        // Deposit money
        account1.deposit(500.00);

        // Withdraw money
        account1.withdraw(300.00);

        // Try to withdraw more than the balance
        account1.withdraw(1500.00);

        // Display final account details
        account1.displayAccountInfo();
    }
}
