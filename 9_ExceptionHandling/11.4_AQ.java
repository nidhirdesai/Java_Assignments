//Using getMessage() and printStackTrace()
//Print detailed exception messages.
package assignmentprograms;

public class AQ16 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // ArithmeticException
        } 

        catch (ArithmeticException e) {

            // Prints only the exception message
            System.out.println("Using getMessage(): " + e.getMessage());

            // Prints full exception details with stack trace
            System.out.println("\nUsing printStackTrace():");
            e.printStackTrace();
        }
    }
}
/*
Using getMessage(): / by zero

Using printStackTrace():
java.lang.ArithmeticException: / by zero
	at EH_Assignments/assignmentprograms.AQ16.main(AQ16.java:13)
  */
