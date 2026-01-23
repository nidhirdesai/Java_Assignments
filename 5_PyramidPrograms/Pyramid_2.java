/*OUTPUT:
        1 
      1 1 
    1 1 1 
  1 1 1 1 
1 1 1 1 1 
*/
package practiceprograms1;

public class pyramid2 {

	public static void main(String[] args) {
		 int nos = 8;

	        for (int r = 1; r <= 5; r++) {   // decide the number of rows

	            for (int s = 1; s <= nos; s++) {   // decide the number of spaces
	                System.out.print(" ");
	            }

	            for (int x = 1; x <= r; x++) {   // decide how many times 1 is printed
	                System.out.print("1 ");
	            }

	            nos = nos - 2;
	            System.out.println();   // move to next line
	        }
	    }
	}
