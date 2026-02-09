package exceptionhandling;

import java.util.Scanner;

public class EH2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];  // Size = 5 (Index 0 to 4)
		
		System.out.print("Enter position (0-4): ");
		int pos = sc.nextInt();
		
		System.out.print("Enter value: ");
		int value=sc.nextInt();
		
		try
		{
			a[pos]=value;
			System.out.println("Value stored: " + a[pos]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			 System.out.println("Invalid Index! Enter between 0 and 4");
		}
		
		sc.close();

	}

}
