//Logging Custom Exceptions
//Use Java Logging API to log custom exceptions.
package assignmentprograms;

import java.util.logging.Level;
import java.util.logging.Logger;

// Custom Exception
class InvalidSalaryException extends Exception {

    public InvalidSalaryException(String message) {
        super(message);   // Pass message to parent Exception class
    }
}

public class AQ22 {

    // Create Logger object
    private static final Logger logger =
            Logger.getLogger(AQ22.class.getName());

    // Method to validate salary
    static void checkSalary(double salary)
            throws InvalidSalaryException {

        if (salary <= 0) {
            throw new InvalidSalaryException(
                    "Salary must be greater than zero");
        }

        System.out.println("Valid salary entered.");
    }

    public static void main(String[] args) {

        try {
            checkSalary(-5000);   // Invalid salary
        }
        catch (InvalidSalaryException e) {

            // Log custom exception with stack trace
            logger.log(Level.SEVERE,
                       "Custom Exception Occurred: "
                               + e.getMessage(),
                       e);
        }
    }
}
