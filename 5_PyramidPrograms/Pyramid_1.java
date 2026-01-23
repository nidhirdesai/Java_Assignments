/*OUTPUT:
1 
1 1 
1 1 1 
1 1 1 1 
1 1 1 1 1 
*/
package practiceprograms1;

public class pyramid1 {

	public static void main(String[] args) {
		 int r, n;
	        for (r = 1; r <= 5; r++)
	        {
	            for (n = 1; n <= r; n++) 
	            {
	                System.out.print("1 ");
	            }
	            System.out.println();
	        }
	    }
	}
