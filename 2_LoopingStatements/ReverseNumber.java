package practiceprograms;

public class ReverseNumber {

    public static void main(String[] args) {

        int number = 1234;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;        // get last digit
            reverse = reverse * 10 + digit; // build reverse number
            number = number / 10;           // remove last digit
        }

        System.out.println("Reversed number is: " + reverse);
    }
}
