//Handling NullPointerException
//Write a program that handles null reference access.
package assignmentprograms;

public class AQ15 {

    public static void main(String[] args) {

        try {
            String str = null;   // Null reference
            System.out.println("Length of string: " + str.length());
        } 

        catch (NullPointerException e) {
            System.out.println("Cannot access method on a null reference");
        }

        System.out.println("Program continues normally...");
    }
}
//Cannot access method on a null reference
//Program continues normally...
