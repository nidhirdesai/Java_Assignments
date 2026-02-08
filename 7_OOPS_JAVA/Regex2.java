package prog;

import java.util.Scanner;

public class Regex2{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 String emailRegex = "[a-z0-9]+@[a-z]+\\.com";
		
		 System.out.print("Enter Email: ");
	        String email = sc.next();

	        if (email.matches(emailRegex)) 
	        {
	            System.out.println("Valid Email ID");
	        } 
	        else 
	        {
	            System.out.println("Invalid Email ID");
	        }

	}

}
