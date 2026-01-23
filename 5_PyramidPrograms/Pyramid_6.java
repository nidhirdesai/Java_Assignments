/*OUTPUT:
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
package practiceprograms1;

public class pyramid6 {

	public static void main(String[] args) {
		 // Outer loop for rows
        for (int r = 1; r <= 5; r++) {

            // Inner loop prints numbers from 1 to r
            for (int c = 1; c <= r; c++) //Row 3 → prints 1 2 3
            {
                System.out.print(c + " ");
            }

            // Go to next line
            System.out.println();
        }
    }
}
