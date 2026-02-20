//Input Validation
//Use throw to reject invalid user input (e.g., entering negative numbers).
package assignmentprograms;

import java.util.Scanner;

public class AQ5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num < 0) 
            {
                throw new Exception("Number cannot be negative");
            }
            System.out.println("You entered: " + num);
        } 
        catch (Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
//Enter a number: -1
//Error: Number cannot be negative
