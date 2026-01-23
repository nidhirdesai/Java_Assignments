/*OUTPUT: 
Maximum element: 45
Minimum element: 5 
 */
package arrayprograms;

public class MaxMinArray {

    public static void main(String[] args) {

        // Declare and initialize the array
        int[] arr = {25, 10, 45, 5, 30};

        // Assume first element is both max and min
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Check for maximum
            if (arr[i] > max) 
            {
                max = arr[i];
            }

            // Check for minimum
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }

        // Print results
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
