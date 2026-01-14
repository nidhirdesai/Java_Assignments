package practiceprograms1;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String");
		String str = sc.nextLine();
		
		char[] chars = str.toCharArray(); //"hello" → ['h','e','l','l','o']
		
		System.out.println("Duplicate characters:");
		
		for(int i=0; i < chars.length;i++)//Picks one character at a time
		{
			for(int j=i+1;j<chars.length;j++)//Compares current character with remaining characters
			{
				if(chars[i]==chars[j])
				{
					System.out.print(chars[i]);
					break;
				}
			}
		}

	}

}
