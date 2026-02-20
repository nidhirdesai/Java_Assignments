//Nested Try-Catch
//Implement nested try-catch to handle exceptions at multiple levels.
package assignmentprograms;

public class AQ11 {

    public static void main(String[] args) {

        try {
            // Outer try block
            int arr[] = {1, 2, 3};

            try {
                // Inner try block
                int a = 10;
                int b = 0;
                int result = a / b;   // ArithmeticException
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            System.out.println(arr[5]);   // ArrayIndexOutOfBoundsException
        } 

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of range");
        }

        catch (Exception e) {
            System.out.println("Some other error occurred");
        }
    }
}
//Inner catch: Cannot divide by zero
//Outer catch: Array index out of range
