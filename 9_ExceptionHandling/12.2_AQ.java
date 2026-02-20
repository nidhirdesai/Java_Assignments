//Custom Exception for Invalid Age
//Implement a custom exception for invalid age input.
package assignmentprograms;

// Step 1: Create Custom Exception
class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AQ19 {

    // Method to check age
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Age is valid. You can proceed.");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);   // Invalid age
        } 
        catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
//Exception caught: Age must be 18 or above
