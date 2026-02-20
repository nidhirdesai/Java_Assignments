//Using super() in Custom Exception
//Pass an error message using super().
package assignmentprograms;

// Step 1: Create Custom Exception
class InvalidMarksException extends Exception {

    // Constructor using super()
    public InvalidMarksException(String message) {
        super(message);   // Passing message to parent Exception class
    }
}

public class AQ21 {

    // Method to check marks
    static void checkMarks(int marks) throws InvalidMarksException {

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100");
        }

        System.out.println("Marks are valid.");
    }

    public static void main(String[] args) {

        try {
            checkMarks(150);   // Invalid marks
        } 
        catch (InvalidMarksException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
//Exception caught: Marks should be between 0 and 100
