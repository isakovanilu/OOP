package BankingSystem;

public class Account {
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        // Example usage
        Account account = new Account("123456789", 500.0);
        account.checkBalance();
        account.deposit(150.0);
        account.checkBalance();
        account.withdraw(100.0);
        account.checkBalance();
        account.withdraw(600.0); // Should display insufficient funds message
    }
}
