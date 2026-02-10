package exceptionhandling;

public class EH4 {

	public static void main(String[] args) {
		
		String s = null;
		try {
			System.out.print(s.length());
		}
		catch(NullPointerException e)
		{
			 System.out.println("String is null. Cannot find length");
		}
	}
}
/*Expected Output:
String is null. Cannot find length
*/
