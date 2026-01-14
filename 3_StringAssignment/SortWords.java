package practiceprograms1;

import java.util.Arrays; //Arrays.sort()
import java.util.Scanner;

public class SortWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" "); //["java", "is", "very", "easy"]


        Arrays.sort(words); //["easy", "is", "java", "very"]


        System.out.println("Sorted words:");
        
        for (String word : words) //Goes through each word in the words array,one word at a time

        {
            System.out.println(word);
        }
    }
}
