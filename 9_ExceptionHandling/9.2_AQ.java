//Custom Exception Using throw
//Create and throw a custom exception if age is below 18 for voting.
package assignmentprograms;

// Custom Exception
class AgeException extends Exception {
    AgeException(String msg) 
    {
        super(msg);
    }
}

public class AQ4 {

    static void checkAge(int age) throws AgeException 
    {
        if (age < 18) 
        {
            throw new AgeException("Not eligible to vote");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);   // Change value to test
        } 
        catch (AgeException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
//Not eligible to vote
