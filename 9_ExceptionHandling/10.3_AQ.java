// Using finally
//Write a program to close a file in the finally block.
package assignmentprograms;

import java.io.*;

public class AQ10 {

    public static void main(String[] args) {

        FileReader file = null;

        try {
            file = new FileReader("test.txt");
            System.out.println("File opened successfully");
        } 

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 

        finally {
            try {
                if (file != null) {
                    file.close();
                    System.out.println("File closed in finally block");
                }
            } 
            catch (IOException e) {
                System.out.println("Error while closing file");
            }
        }
    }
}
//File not found
