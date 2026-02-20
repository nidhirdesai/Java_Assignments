// Handling Multiple Custom Exceptions
//Create different exceptions for various invalid inputs.
package assignmentprograms;

// Custom Exception 1
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom Exception 2
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class AQ20 {

    // Method to validate inputs
    static void validate(int age, double amount)
            throws InvalidAgeException, InvalidAmountException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }

        System.out.println("All inputs are valid.");
    }

    public static void main(String[] args) {

        try {
            validate(16, -500);   // Both invalid (age checked first)
        } 
        catch (InvalidAgeException e) {
            System.out.println("Age Error: " + e.getMessage());
        } 
        catch (InvalidAmountException e) {
            System.out.println("Amount Error: " + e.getMessage());
        }
    }
}
//Age Error: Age must be 18 or above
