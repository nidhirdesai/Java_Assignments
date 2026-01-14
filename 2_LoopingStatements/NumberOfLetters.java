package practiceprograms;

import java.util.Scanner;

public class NumberofLetters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // count only letters
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        System.out.println("Number of letters: " + count);
    }
}
