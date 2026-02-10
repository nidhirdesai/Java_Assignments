package exceptionhandling;

public class EH5 {

	public static void main(String[] args) {
		int a = 10;
        int b = 0;

        try {
         
            int result = a / b;
            System.out.println("Result = " + result);
        }
	  catch (ArithmeticException e)
        {
          System.out.println("Error: Cannot divide by zero");
      } 
        finally 
        {
        	System.out.println("This is finally block");
        }

        System.out.println("Program continues...");
        }
	}
/* Expected Output:
Error: Cannot divide by zero
This is finally block
Program continues... */
