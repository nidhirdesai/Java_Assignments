/*OUTPUT:
Diagonal Sum: 15
*/

package arrayprograms;

public class DiagonalSum {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int sum = 0;

	        // Add diagonal elements
	        for (int i = 0; i < 3; i++) 
	        {
	            sum = sum + matrix[i][i]; //[0][0], [1][1], [2][2]
	        }

	        System.out.println("Diagonal Sum: " + sum);
	    }
	}
