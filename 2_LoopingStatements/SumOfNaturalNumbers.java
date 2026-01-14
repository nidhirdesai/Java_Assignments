package practiceprograms;

import java.util.Scanner;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Natural Number:");
		
		int N=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=N;i++)
		{
		sum=sum+i;
	}
		System.out.println("Sum of first "+N+ " numbers is: " + sum);
	}
}
