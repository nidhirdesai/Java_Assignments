//Creating a Custom Exception
//Create a LowBalanceException for bank transactions.
package assignmentprograms;

// Step 1: Create Custom Exception
class LowBalanceException extends Exception {

    public LowBalanceException(String message) {
        super(message);
    }
}

public class AQ18 {

    // Method for withdrawing money
    static void withdraw(double balance, double amount)
            throws LowBalanceException {

        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");
        }

        System.out.println("Withdrawal successful. Remaining balance: "
                + (balance - amount));
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 7000);   // Trying to withdraw more than balance
        } 
        catch (LowBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
//Transaction failed: Insufficient balance!
