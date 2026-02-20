//Using throw to Raise an Exception
//Write a method that throws an exception when the input is negative.

package assignmentprograms;

public class AQ3 {

    static void check(int num) 
    {
        if (num < 0) 
        {
            throw new ArithmeticException("-ve number not allowed");
            //int a = 10/0;
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {

        try {
            check(-3);   // Passing a negative number
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }
}
//Exception occured: -ve number not allowed
