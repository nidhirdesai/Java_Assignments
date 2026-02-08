package prog;

import java.util.Scanner;

public class Regex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String mobileRegex = "[6-9][0-9]{9}";
		
		System.out.print("Enter Mobile Number: ");
        String mobile = sc.next();

        if (mobile.matches(mobileRegex)) 
        {
            System.out.println("Valid Mobile Number");
        } 
        else
        {
            System.out.println("Invalid Mobile Number");
        }

	}

}
