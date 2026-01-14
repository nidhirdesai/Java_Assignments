package practiceprograms1;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();//GADAG

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) { //GADAG i=2 'D'
            reverse = reverse + str.charAt(i); //reverse=G+A+D+A+G
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }
    }
}
