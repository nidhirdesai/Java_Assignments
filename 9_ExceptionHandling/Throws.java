package exceptionhandling;

import java.io.IOException;

 class ThrowsDemo{
	
	static void readData() throws IOException{ //This method may cause an IOException
		                                      //Caller must handle it
		throw new IOException("File not found"); //Creates a new IOException object.
	}
}

public class EH6 {

	public static void main(String[] args) {
		
		try
		{
			ThrowsDemo.readData(); // Call using class name
		}
		catch(IOException e)
		{
			System.out.println("Error: " + e.getMessage());//Gets error message
		}
		System.out.println("Program continues...");
	}

}
/*Expected Output:
Error: File not found
Program continues...
*/
