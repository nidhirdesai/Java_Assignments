//Exception Logging
//Log exceptions using System.err.println() or Java Logging API.
package assignmentprograms;

public class AQ12 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException
        } 

        catch (ArithmeticException e) {
            System.err.println("Error occurred: " + e);
            System.err.println("Error message: " + e.getMessage());
        }
    }
}
//Error occurred: java.lang.ArithmeticException: / by zero
//Error message: / by zero
