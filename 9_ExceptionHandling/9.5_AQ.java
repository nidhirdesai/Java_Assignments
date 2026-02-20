//Rethrowing Exceptions
//Catch an exception and rethrow it.

package assignmentprograms;

public class AQ7 {

    static void checkNumber(int num) throws Exception {

        try {
            if (num < 0) {
                throw new Exception("Number is negative");
            }
            System.out.println("Valid number: " + num);
        } 
        catch (Exception e) {
            System.out.println("Caught inside method");
            throw e;   // Rethrowing the exception
        }
    }

    public static void main(String[] args) {

        try {
            checkNumber(-10);
        } 
        catch (Exception e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}
//Caught inside method
//Handled in main: Number is negative
