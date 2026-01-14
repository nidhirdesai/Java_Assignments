package practiceprograms1;

import java.util.Scanner;

public class NumberofWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine(); //Hello World

        str=str.trim();
        
        if (str.isEmpty()) 
        {
            System.out.println("Number of words: 0");
	}
        else
        {
        	 String[] words = str.split("\\s+"); //Hello World
        	 //String str = "Java   is   very easy";
             //["Java", "is", "very", "easy"]                 ["Hello","World"]

             System.out.println("Number of words: " + words.length);
        }
	}
}
