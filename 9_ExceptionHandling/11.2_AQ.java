//Exception Hierarchy
//Show how Throwable is the parent of Exception and Error.
package assignmentprograms;

public class AQ14 {

    public static void main(String[] args) {

        // Exception example
        try {
            throw new Exception("This is an Exception");
        } 
        catch (Throwable t) {   // Catching using parent class
            System.out.println("Caught Exception using Throwable");
        }

        // Error example
        try {
            throw new Error("This is an Error");
        } 
        catch (Throwable t) {   // Catching using parent class
            System.out.println("Caught Error using Throwable");
        }
    }
}
//Caught Exception using Throwable
//Caught Error using Throwable
