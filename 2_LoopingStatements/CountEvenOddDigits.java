package practiceprograms;

public class CountEvenOddDigits {

    public static void main(String[] args) {

        int number = 641538927;
        int evenCount = 0;
        int oddCount = 0;

        while (number != 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            number = number / 10;
        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}
