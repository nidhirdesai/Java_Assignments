// Using throws for Exception Declaration
//Declare a method with throws to specify possible exceptions.
package assignmentprograms;

import java.io.*;

public class AQ17 {

    // Method declaring exception using throws
    static void readFile() throws IOException {

        FileReader file = new FileReader("test.txt");
        System.out.println("File opened successfully");
        file.close();
    }

    public static void main(String[] args) {

        try {
            readFile();   // Calling method
        } 
        catch (IOException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }
    }
}
//Exception handled in main: test.txt (The system cannot find the file specified)
