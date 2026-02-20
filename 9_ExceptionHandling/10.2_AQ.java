//Multi-Catch Block
//Catch IOException and ArithmeticException in a single catch block.

package assignmentprograms;

import java.io.*;

public class AQ9 {

    public static void main(String[] args) {

        try {

            // Arithmetic Exception
            int a = 10;
            int b = 0;
            int result = a / b;

            // IOException
            FileReader file = new FileReader("test.txt");

        } 

        catch (ArithmeticException | IOException e) {
            System.out.println("Exception occurred: " + e.getClass().getSimpleName());
        }

        catch (Exception e) {
            System.out.println("Some other error occurred");
        }
    }
}
//Exception occurred: ArithmeticException
