package dxpath;

import java.util.Scanner;

public class JPA1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 6 digit number: [do not use 0 and 9]");
		String number = sc.nextLine();
		
		if(number.length()!=6)
		{
			System.out.println("Please enter only 6 digits");
			return;
		}
		
		String result = "";
		
		for(int i=0;i<number.length();i++)
		{
			char ch = number.charAt(i);
			int digit = ch - '0';
			
			if(digit ==0 || digit ==9)
			{
				System.out.println("Digits 0 and 9 are not allowed");
				return;
			}
			
			if(digit % 2 ==0)
			{
				digit = digit +2;
			}
			else
			{
				digit = digit -1;
			}
			
			result = result+digit;
		}
		
		System.out.println("Output: "+result);
		sc.close();
	}

}
