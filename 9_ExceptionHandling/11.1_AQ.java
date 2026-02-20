//Checked vs Unchecked Exceptions
//Demonstrate checked (IOException) and unchecked (NullPointerException) exceptions.
package assignmentprograms;

import java.io.*;

public class AQ13 {

    public static void main(String[] args) {

        // ----- Checked Exception Example -----
        try {
            FileReader file = new FileReader("test.txt");
            System.out.println("File opened successfully");
            file.close();
        } 
        catch (IOException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
        }

        // ----- Unchecked Exception Example -----
        try {
            String str = null;
            System.out.println(str.length());   // NullPointerException
        } 
        catch (NullPointerException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }
    }
}
//Checked Exception caught: test.txt (The system cannot find the file specified)
//Unchecked Exception caught: java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
