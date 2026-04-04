package dxpath;

import java.util.Scanner;

public class JPA2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [3][4];
		
		System.out.println("Enter the numbers for array:");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}

		int max = arr[0][0];
		int min = arr[0][0];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if (arr[i][j]>max)
				{
					max=arr[i][j];
				}
				if (arr[i][j]<min)
				{
					min=arr[i][j];
				}
				
			}
		}
		
		System.out.println("Largest element in array is " + max);
		System.out.println("Smallest element in array is " + min);
		
		sc.close();
		
	}

}
/*Output:
Enter the numbers for array:
8 19 23 78 56 34 98 21 49 71 64 12
Largest element in array is 98
Smallest element in array is 8*/
