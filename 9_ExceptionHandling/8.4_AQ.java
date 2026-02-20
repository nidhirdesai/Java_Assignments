//Exception in Method Call
//Write a method that throws an exception and handle it in main().

package assignmentprograms;

public class AQ1 {

    // Method that throws exception
    static void divide(int a, int b) throws ArithmeticException 
    {
        int result = a / b;   
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        try {
            divide(10, 0);   // Calling method
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Exception handled in main()");
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues normally...");
    }
}
/*
Exception handled in main()
Cannot divide by zero
Program continues normally...
*/
