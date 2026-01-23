/*OUTPUT:
Largest Number: 40
*/
package arrayprograms;

public class LargestNumber {

	public static void main(String[] args) {
		int[][] arr = {
	            {10, 25, 5},
	            {40, 15, 20}
	        };

	        int max = arr[0][0];

	        // Find largest
	        for (int i = 0; i < 2; i++)
	        {
	            for (int j = 0; j < 3; j++) 
	            {
	                if (arr[i][j] > max) 
	                {
	                    max = arr[i][j];
	                }
	            }
	        }
	        System.out.println("Largest Number: " + max);
    }
}
