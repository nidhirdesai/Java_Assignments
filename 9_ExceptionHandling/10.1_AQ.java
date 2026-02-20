//Using try-catch for Multiple Exceptions
//Handle division by zero and array out-of-bounds exceptions in one try block.
package assignmentprograms;

public class AQ8 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;   // Division by zero

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);   // Array index out of bounds
        } 

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }

        catch (Exception e) {
            System.out.println("Some other error occurred");
        }
    }
}
//Cannot divide by zero
