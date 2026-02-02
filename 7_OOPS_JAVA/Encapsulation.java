package oopsprograms;

// BankAccount class with Encapsulation
class BankAccount {

    // Private data member (Hidden)
    private int balance;

    // Setter Method (Deposit / Add money)
    public void setBalance(int amount) {

        if (amount > 0) 
        {
            balance = balance + amount;
        } 
        else
        {
            System.out.println("Invalid amount");
        }
    }

    // Withdraw Method
    public void withdraw(int amount) 
    {

        if (amount > 0 && amount <= balance) 
        {
            balance = balance - amount;
        } 
        else 
        {
            System.out.println("Invalid withdraw amount");
        }
    }

    // Getter Method (Read Access)
    public int getBalance() 
    {
        return balance;
    }
}

// Main class
public class BankAccountEn {

    public static void main(String[] args) {

        // Creating object
        BankAccount acc = new BankAccount();

        // Deposit money
        acc.setBalance(5000);

        // Withdraw money
        acc.withdraw(2000);

        // Getting balance
        System.out.println("Balance: " + acc.getBalance());
    }
}
